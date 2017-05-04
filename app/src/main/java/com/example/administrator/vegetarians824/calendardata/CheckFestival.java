package com.example.administrator.vegetarians824.calendardata;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016-10-26.
 */
public class CheckFestival {
    private Map<String, String> map = new HashMap<String, String>();
    private String what;
    public CheckFestival(String s){
        putMap();
        this.what=s;
    }
    public String getFestival(){
        if(map.containsKey(what)){
            return map.get(what);
        }else
            return "";
    }
    public void putMap(){
        map.put("1-1","元旦");
        map.put("2-2","世界湿地日");
        map.put("2-10","国际气象节");
        map.put("2-14","情人节");
        map.put("2-21","反对殖民制度斗争日");
        map.put("2-24","第三世界青年日");
        map.put("2-28","世界居住条件调查日");
        map.put("3-1","国际海豹日");
        map.put("3-3","全国爱耳日");
        map.put("3-5","中国青年志愿者服务日");
        map.put("3-8","国际劳动妇女节");
        map.put("3-12","中国植树节");
        map.put("3-14","国际警察日");
        map.put("3-15","国际消费者权益日");
        map.put("3-16","手拉手情系贫困小伙伴全国统一行动日");
        map.put("3-17","国际航海日");
        map.put("3-18","全国科技人才活动日");
        map.put("3-21","世界林业日，消除种族歧视国际日，世界儿歌日，世界睡眠日");
        map.put("3-22","世界水日");
        map.put("3-23","世界气象日");
        map.put("3-24","世界防治结核病日");
        map.put("4-1","国际愚人节");
        map.put("4-2","国际儿童图书日");
        map.put("4-7","世界卫生日");
        map.put("4-21","全国企业家活动日");
        map.put("4-22","世界地球日，世界法律日");
        map.put("4-23","世界图书和版权日");
        map.put("4-24","世界青年反对殖民主义日，亚非新闻工作者日");
        map.put("4-25","全国预防接种宣传日");
        map.put("4-26","世界知识产权日");
        map.put("4-27","联谊城日");
        map.put("4-30","全国交通安全反思日");
        map.put("5-1","国际劳动节，国际示威游行日");
        map.put("5-3","世界哮喘日");
        map.put("5-4","中国青年节，五四运动纪念日，科技传播日");
        map.put("5-5","全国碘缺乏病防治日");
        map.put("5-8","世界红十字日，世界微笑日");
        map.put("5-12","国际护士节");
        map.put("5-15","国际家庭(咨询)日");
        map.put("5-17","世界电信日");
        map.put("5-18","国际博物馆日");
        map.put("5-20","全国母乳喂养宣传日，中国学生营养日");
        map.put("5-26","世界向人体条件挑战日");
        map.put("5-30","五卅反对帝国主义运动纪念日");
        map.put("5-31","世界无烟日");
        map.put("6-1","国际儿童节");
        map.put("6-5","世界环境日");
        map.put("6-6","全国爱眼日");
        map.put("6-20","世界难民日");
        map.put("6-22","中国儿童慈善活动日");
        map.put("6-23","国际奥林匹克日、世界手球日");
        map.put("6-25","全国土地日");
        map.put("6-26","国际禁毒日、联合国宪章日");
        map.put("6-30","世界青年联欢节");
        map.put("7-1","中国共产党诞生日，香港回归纪念日，国际建筑日");
        map.put("7-2","国际体育记者日");
        map.put("7-7","中国人民抗日战争纪念日");
        map.put("7-11","世界人口日");
        map.put("7-26","世界语创立日");
        map.put("7-30","非洲妇女日");
        map.put("8-1","中国人民解放军建军节");
        map.put("8-6","国际电影节");
        map.put("8-8","中国男子节");
        map.put("8-26","全国律师咨询日");
        map.put("9-3","中国抗日战争胜利纪念日");
        map.put("9-8","国际新闻工作者(团结)日，世界扫盲日");
        map.put("9-10","中国教师节");
        map.put("9-14","世界清洁地球日");
        map.put("9-16","国际臭氧层保护日");
        map.put("9-18","九一八事变纪念日");
        map.put("9-20","全国爱牙日");
        map.put("9-21","国际和平日");
        map.put("9-27","世界旅游日");
        map.put("10-1","国庆节，国际音乐日，国际老人节");
        map.put("10-2","国际和平(与民主自由)斗争日");
        map.put("10-4","世界动物日");
        map.put("10-8","全国高血压日，世界视觉日，国际左撇子日");
        map.put("10-9","世界邮政日");
        map.put("10-10","辛亥革命纪念日，世界居室卫生日，世界精神卫生日");
        map.put("10-13","中国少年先锋队诞辰日，世界保健日，国际教师节");
        map.put("10-14","世界标准日");
        map.put("10-15","国际盲人节");
        map.put("10-16","世界粮食日");
        map.put("10-17","世界消除贫困日");
        map.put("10-22","世界传统医药日");
        map.put("10-24","联合国日，世界发展信息日");
        map.put("10-28","男性健康日");
        map.put("10-31","世界勤俭日");
        map.put("11-8","中国记者节");
        map.put("11-9","中国消防宣传日");
        map.put("11-10","世界青年节");
        map.put("11-14","世界糖尿病日");
        map.put("11-17","国际大学生节");
        map.put("11-21","世界电视日，世界问候日");
        map.put("12-1","世界艾滋病日");
        map.put("12-2","废除一切形式奴役世界日");
        map.put("12-3","世界残疾人日");
        map.put("12-4","中国法制宣传日");
        map.put("12-5","国际志愿人员日，世界弱能人士日");
        map.put("12-7","国际民航日");
        map.put("12-9","运动纪念日、世界足球日");
        map.put("12-10","世界人权日");
        map.put("12-11","世界防治哮喘日");
        map.put("12-12","西安事变纪念日");
        map.put("12-13","南京大屠杀纪念日");
        map.put("12-15","世界强化免疫日");
        map.put("12-20","澳门回归纪念日");
        map.put("12-21","国际篮球日");
        map.put("12-24","平安夜");
        map.put("12-25","圣诞节");
        map.put("12-29","国际生物多样性日");
    }

}