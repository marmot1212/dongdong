package com.example.administrator.vegetarians824.dongdong;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps2d.AMap;
import com.amap.api.maps2d.LocationSource;
import com.amap.api.maps2d.MapView;
import com.amap.api.maps2d.model.BitmapDescriptorFactory;
import com.amap.api.maps2d.model.MarkerOptions;
import com.amap.api.maps2d.overlay.DrivingRouteOverlay;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.DrivePath;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.WalkRouteResult;
import com.baidu.mobstat.StatService;
import com.example.administrator.vegetarians824.R;
import com.example.administrator.vegetarians824.entry.MyLociation;
import com.example.administrator.vegetarians824.myapplications.BaseApplication;
import com.example.administrator.vegetarians824.util.AMapUtil;
import com.example.administrator.vegetarians824.util.StatusBarUtil;

public class HuodongRoute extends AppCompatActivity{
    private MapView mMapView = null;
    private AMap aMap;
    LatLonPoint mstart,mend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huodong_route);
        StatusBarUtil.setColorDiff(this,0xff00aff0);
        mMapView = (MapView) findViewById(R.id.mapview);
        mMapView.onCreate(savedInstanceState);
        aMap = mMapView.getMap();


        aMap.getUiSettings().setZoomControlsEnabled(false);
        aMap.getUiSettings().setMyLocationButtonEnabled(false);
        aMap.setMyLocationEnabled(true);

        Intent intent=getIntent();
        Double longitude=intent.getDoubleExtra("longitude",0);
        Double latitude=intent.getDoubleExtra("latitude",0);


        initoperate();
        if(BaseApplication.app.getMyLociation()!=null){
            mend=new LatLonPoint(latitude, longitude);
            mstart=new LatLonPoint(Double.valueOf(BaseApplication.app.getMyLociation().getLatitude()), Double.valueOf(BaseApplication.app.getMyLociation().getLongitude()));
            makeRoute(mstart,mend);
            setfromandtoMarker();

        }else {
            Toast.makeText(getBaseContext(),"定位失败！",Toast.LENGTH_SHORT).show();
        }
        //makeRoute(mstart,mend);
        //setfromandtoMarker();

    }


    public void makeRoute(LatLonPoint mStartPoint, LatLonPoint mEndPoint){
        final RouteSearch.FromAndTo fromAndTo = new RouteSearch.FromAndTo(mStartPoint, mEndPoint);
        RouteSearch.DriveRouteQuery query = new RouteSearch.DriveRouteQuery(fromAndTo,  RouteSearch.DrivingDefault, null, null, "");
        RouteSearch mRouteSearch=new RouteSearch(this);
        mRouteSearch.setRouteSearchListener(new RouteSearch.OnRouteSearchListener() {
            @Override
            public void onBusRouteSearched(BusRouteResult busRouteResult, int i) {

            }

            @Override
            public void onDriveRouteSearched(DriveRouteResult result, int i) {
                aMap.clear();
                final DrivePath drivePath = result.getPaths().get(0);
                DrivingRouteOverlay drivingRouteOverlay = new DrivingRouteOverlay(getBaseContext(), aMap, drivePath,
                        result.getStartPos(),
                        result.getTargetPos());
                drivingRouteOverlay.setNodeIconVisibility(false);
                drivingRouteOverlay.removeFromMap();
                drivingRouteOverlay.addToMap();
                drivingRouteOverlay.zoomToSpan();
            }

            @Override
            public void onWalkRouteSearched(WalkRouteResult walkRouteResult, int i) {

            }
        });

        mRouteSearch.calculateDriveRouteAsyn(query);
    }

    public void setfromandtoMarker() {
        aMap.addMarker(new MarkerOptions()
                .position(AMapUtil.convertToLatLng(mstart))
                .visible(true)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.start)));
        aMap.addMarker(new MarkerOptions()
                .position(AMapUtil.convertToLatLng(mend))
                .visible(true)
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.end)));
    }

    public void initoperate(){
        LinearLayout fanhui=(LinearLayout)findViewById(R.id.routes_fanhui);
        fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mMapView.onDestroy();
    }
    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView.onResume ()，实现地图生命周期管理
        mMapView.onResume();

        StatService.onResume(this);

    }
    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView.onPause ()，实现地图生命周期管理
        mMapView.onPause();
        StatService.onPause(this);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //在activity执行onSaveInstanceState时执行mMapView.onSaveInstanceState (outState)，实现地图生命周期管理
        mMapView.onSaveInstanceState(outState);

    }






}
