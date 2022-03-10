package com.example.cloudmusic.ui.rankingList.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class RankingListBean implements Serializable {
    /**
     * JS_CSS_DATE : 20130320
     * kg_domain : http://m.kugou.com
     * src : http://downmobile.kugou.com/promote/package/download/channel=6
     * fr : null
     * ver : v3
     * rank : {"total":26,"list":[{"rank_cid":58138,"id":2,"rankname":"TOP500","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112175202472916.png","rankid":8888,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019122517263545.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":32350386,"img_9":"","custom_type":0,"ranktype":2,"img_cover":"http://imge.kugou.com/mcommon/{size}/20211117/20211117115003451494.png","issue":66,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019122516438289.jpg","show_play_button":0,"jump_title":"","update_frequency":"每天","classify":1,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220304/20220304145206706097.jpg","intro":"数据来源：全曲库歌曲\r\n排序方式：按歌曲喜爱用户数的总量排序\r\n更新频率：每天","imgurl":"http://imge.kugou.com/mcommon/{size}/20181019/20181019122513972113.jpg"},{"rank_cid":58137,"id":1,"rankname":"飙升榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112175144811731.png","rankid":6666,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20190214/20190214100333414437.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":9861754,"img_9":"","custom_type":0,"ranktype":2,"img_cover":"","issue":66,"banner7url":"http://imge.kugou.com/mcommon/{size}/20190906/20190906162522894877.jpg","show_play_button":0,"jump_title":"","update_frequency":"每天","classify":1,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20150718/20150718150204815336.jpg","intro":"数据来源：全曲库歌曲\r\n排序方式：按歌曲喜爱用户数的涨幅排序\r\n更新频率：每天","imgurl":"http://imge.kugou.com/mcommon/{size}/20190906/20190906162520714932.jpg"},{"rank_cid":58118,"id":309,"rankname":"抖音热歌榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112175327168275.png","rankid":52144,"bannerurl":"","isvol":1,"zone":"tx6_gz_kmr","play_times":11038492,"img_9":"http://imge.kugou.com/mcommon/{size}/20210806/20210806193317751530.png","custom_type":0,"ranktype":1,"img_cover":"","issue":10,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211217/20211217143540832517.png","show_play_button":1,"jump_title":"","update_frequency":"周六","classify":1,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20190414/20190414080844443454.jpg","intro":"数据来源：抖音热门歌曲\r\n排序方式：按照歌曲热度排序\r\n更新频率：每周六","imgurl":"http://imge.kugou.com/mcommon/{size}/20210806/20210806193314611523.png"},{"rank_cid":58184,"id":311,"rankname":"快手热歌榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112175343850884.png","rankid":52767,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20210813/20210813121757693708.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":2773053,"img_9":"http://imge.kugou.com/mcommon/{size}/20211217/20211217143652227085.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":67,"banner7url":"http://imge.kugou.com/mcommon/{size}/20210813/20210813121756176400.jpg","show_play_button":1,"jump_title":"","update_frequency":"每天","classify":1,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20190920/20190920191513148104.jpg","intro":"数据来源：快手热门歌曲\r\n排序方式：按照歌曲热度排序\r\n更新频率：每天","imgurl":"http://imge.kugou.com/mcommon/{size}/20211217/20211217143649962754.jpg"},{"rank_cid":58039,"id":265,"rankname":"说唱先锋榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112185300288680.png","rankid":44412,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20211021/20211021121451321597.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":249069,"img_9":"http://imge.kugou.com/mcommon/{size}/20211015/20211015000041777734.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211021/20211021121450944386.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":1,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211126/20211126152602243273.jpg","intro":"数据来源：说唱歌曲\r\n排序方式：说唱歌曲偏好用户中，按歌曲日均喜爱用户数排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20211015/20211015000039682323.jpg"},{"rank_cid":58139,"id":35,"rankname":"内地榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112175510473796.png","rankid":31308,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019122310609161.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":879335,"img_9":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173236811897.jpg","custom_type":0,"ranktype":1,"img_cover":"http://imge.kugou.com/mcommon/{size}/20211117/20211117114613693049.jpg","issue":46,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173234209146.jpg","show_play_button":0,"jump_title":"","update_frequency":"工作日","classify":2,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220304/20220304145206706097.jpg","intro":"数据来源：30天内发行的内地新歌\r\n排序方式：酷狗音乐的喜爱用户数和发行时间等综合评分排序取前100名\r\n更新频率：每周一至周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173233607609.jpg"},{"rank_cid":58032,"id":119,"rankname":"电音榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112185502385779.png","rankid":33160,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121749428993.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":323096,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172333811545.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121747524588.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":5,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20170207/20170207171928308968.jpg","intro":"数据来源：电音歌曲\r\n排序方式：电音歌曲偏好用户中，按歌曲日均喜爱用户数排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172330443978.jpg"},{"rank_cid":58143,"id":39,"rankname":"香港地区榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112180038607846.png","rankid":31313,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019122021568840.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":180361,"img_9":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173413183246.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":46,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173412988476.jpg","show_play_button":0,"jump_title":"","update_frequency":"工作日","classify":2,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220222/20220222173117680012.jpg","intro":"数据来源：90天内发行的香港地区新歌\r\n排序方式：酷狗音乐的喜爱用户数和发行时间等综合评分排序取前100名\r\n更新频率：每周一至周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173410930698.jpg"},{"rank_cid":58052,"id":297,"rankname":"民谣榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112185421213960.png","rankid":51341,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20210618/20210618141310314738.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":160303,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172410668031.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20210726/20210726153251881781.jpg","show_play_button":1,"jump_title":"","update_frequency":"周三","classify":5,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20150718/20150718142754544803.jpg","intro":"数据来源：用户自建民谣类型歌单中的热门歌曲\r\n排序方式：按照歌曲的热度排名\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172407922177.jpg"},{"rank_cid":58156,"id":315,"rankname":"台湾地区榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112180058808380.png","rankid":54848,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20211110/20211110173748430105.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":19451,"img_9":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173749468229.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":46,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173747430064.jpg","show_play_button":0,"jump_title":"","update_frequency":"工作日","classify":2,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220118/20220118222036520776.jpg","intro":"数据来源：90天内发行的台湾地区新歌\r\n排序方式：酷狗音乐的喜爱用户数和发行时间等综合评分排序取前100名\r\n更新频率：每周一至周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173745189571.jpg"},{"rank_cid":58034,"id":123,"rankname":"ACG新歌榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112180755701754.png","rankid":33162,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20190911/20190911195359896034.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":25935,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172516840313.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20190911/20190911195358567855.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":5,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220215/20220215211705256096.jpg","intro":"数据来源：120天内发行的ACG新歌\r\n排序方式：按歌曲热度、歌手等级和发行时间综合评分排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172513187588.jpg"},{"rank_cid":58142,"id":69,"rankname":"日本榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112180343906494.png","rankid":31312,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019122124188716.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":20696,"img_9":"http://imge.kugou.com/mcommon/{size}/20211110/20211110174316588086.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":46,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211110/20211110174314539497.jpg","show_play_button":0,"jump_title":"","update_frequency":"工作日","classify":2,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211216/20211216002435409663.jpg","intro":"数据来源：90天内发行的日本乐坛新歌\r\n排序方式：酷狗音乐的喜爱用户数和发行时间等综合评分排序取前100名\r\n更新频率：每周一至周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20211110/20211110174313329340.jpg"},{"rank_cid":58050,"id":193,"rankname":"欧美金曲榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182840988260.png","rankid":33166,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121546998825.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":288583,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173636666354.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121544655833.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211115/20211115045904772504.jpg","intro":"数据来源：英语/西班牙语/葡萄牙语/法语/德语/德语歌曲\r\n排序方式：按歌曲完整播放日均量排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173632620715.jpg"},{"rank_cid":58035,"id":77,"rankname":"影视金曲榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182855975994.png","rankid":33163,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121704873377.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":124905,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173708277651.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121701875027.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20151228/20151228053106528158.jpg","intro":"数据来源：影视歌曲\r\n排序方式：影视歌曲偏好用户中，按歌曲日均喜爱用户数排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173705332402.jpg"},{"rank_cid":58048,"id":303,"rankname":"重低音榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182931688738.png","rankid":51346,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20210618/20210618142055341871.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":86296,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173825271400.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20210726/20210726153346661772.jpg","show_play_button":1,"jump_title":"","update_frequency":"周三","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20200507/20200507012344117630.jpg","intro":"数据来源：用户自建重低音类型歌单中的热门歌曲\r\n排序方式：按照歌曲的热度排名\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173822486990.jpg"},{"rank_cid":58144,"id":227,"rankname":"雷达榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112183008512213.png","rankid":37361,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20190808/20190808200005885980.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":175152,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174035666943.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":46,"banner7url":"http://imge.kugou.com/mcommon/{size}/20190808/20190808200003312447.jpg","show_play_button":0,"jump_title":"","update_frequency":"工作日","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220129/20220129174800237317.jpg","intro":"数据来源：浮浮雷达+酷狗听歌识曲\r\n排序方式：按近一周识曲用户数排序\r\n更新频率：每周一至周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174032634577.jpg"},{"rank_cid":58046,"id":275,"rankname":"综艺新歌榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112183043219580.png","rankid":46910,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20201109/20201109170517558959.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":33813,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174144213125.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20201109/20201109170516777658.png","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220131/20220131160903243492.jpg","intro":"数据来源：60天内发行的综艺新歌\r\n排序方式：按歌曲热度、歌手等级和发行时间综合评分排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174141989249.jpg"},{"rank_cid":58157,"id":167,"rankname":"酷狗音乐人原创榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220117/20220117163024782170.png","rankid":30972,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20210125/20210125161120160525.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":24370,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174213907074.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":66,"banner7url":"http://imge.kugou.com/mcommon/{size}/20210125/20210125161119250170.jpg","show_play_button":0,"jump_title":"","update_frequency":"每天","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220227/20220227150320357877.jpg","intro":"数据来源：酷狗原创音乐\r\n排序方式：按播放量、话题热度等维度排序\r\n更新频率：每天","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174210939378.jpg"},{"rank_cid":57997,"id":30,"rankname":"分享榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112183146170638.png","rankid":21101,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121900772347.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":754443,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174300312808.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":8,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121858279252.jpg","show_play_button":0,"jump_title":"","update_frequency":"周二","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20210919/20210919203701349992.jpg","intro":"数据来源：歌曲分享拉起用户数\r\n排序方式：按点击歌曲分享拉起的用户数排序\r\n更新频率：每周二","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174258457920.jpg"},{"rank_cid":58078,"id":10,"rankname":"美国BillBoard榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112181537635196.png","rankid":4681,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121340103598.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":58844,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180224544189.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121339813327.jpg","show_play_button":0,"jump_title":"","update_frequency":"周四","classify":4,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211224/20211224103718958385.jpg","intro":"数据来源：美国Billboard Top100\r\n排序方式：根据歌曲在美国的实体销量、电台播放量、流媒体下载量等指标进行排序\r\n更新频率：每周四","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180223443800.jpg"},{"rank_cid":58056,"id":153,"rankname":"Beatport电子舞曲榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112181554865370.png","rankid":25028,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170223/20170223182819501244.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":11961,"img_9":"http://imge.kugou.com/mcommon/{size}/20210813/20210813140907176359.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20170223/20170223182818350949.png","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":4,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211204/20211204071606706482.jpg","intro":"数据来源：Beatport音乐网站\r\n排序方式：根据Beatport网站上的播放次数计算排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20210813/20210813140906470933.jpg"},{"rank_cid":58159,"id":12,"rankname":"英国单曲榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112181644889766.png","rankid":4680,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121317188050.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":13907,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180312952034.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":10,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121316839345.jpg","show_play_button":0,"jump_title":"","update_frequency":"周一","classify":4,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211224/20211224103718958385.jpg","intro":"数据来源：英国Single Chart Top 40\r\n排序方式：根据歌曲在英国的一周销量进行排序\r\n更新频率：每周一","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180311445477.jpg"},{"rank_cid":58160,"id":9,"rankname":"韩国Melon音乐榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112181946586976.png","rankid":38623,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121225649566.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":14705,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180514209064.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":10,"banner7url":"http://imge.kugou.com/mcommon/{size}/20191021/20191021201705225728.jpg","show_play_button":0,"jump_title":"","update_frequency":"周一","classify":4,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211208/20211208163907496371.jpg","intro":"数据来源：韩国Melon\r\n排序方式：根据Melon的销售、下载、播放等指标进行排序\r\n更新频率：每周一","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180513682585.jpg"},{"rank_cid":58103,"id":251,"rankname":"joox本地热歌榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182022801936.png","rankid":42807,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20200320/20200320185608883318.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":8993,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180413341778.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20200320/20200320185607939528.jpg","show_play_button":0,"jump_title":"","update_frequency":"周五","classify":4,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220128/20220128124933403824.jpg","intro":"数据来源：JOOX平台\r\n排序方式：根据JOOX播放等指标进行排序\r\n更新频率：每周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180412417965.jpg"},{"rank_cid":58053,"id":273,"rankname":"日本SPACE SHOWER榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182338294233.png","rankid":46868,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20201028/20201028152647239085.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":1565,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180947808622.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":8,"banner7url":"http://imge.kugou.com/mcommon/{size}/20201028/20201028152646615355.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":4,"album_img_9":"http://singerimg.kugou.com/uploadpic/softhead/{size}/20201124/20201124173440196.jpg","intro":"数据来源：日本音乐频道 SPACE SHOWER TV\r\n排序方式：根据SPACE SHOWER频道上的播放次数计算排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180946131853.jpg"},{"rank_cid":58104,"id":253,"rankname":"KKBOX风云榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182509814250.png","rankid":42808,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20210310/20210310161810367993.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":4147,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180834806222.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20210310/20210310161809747097.jpg","show_play_button":0,"jump_title":"","update_frequency":"周五","classify":4,"album_img_9":"","intro":"数据来源：KKBOX平台\r\n排序方式：根据KKBOX播放等指标进行排序\r\n更新频率：每周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180832806920.jpg"}]}
     * __Tpl : rank/list.html
     */

    @SerializedName("JS_CSS_DATE")
    private int js_css_date;
    private String kg_domain;
    private String src;
    private Object fr;
    private String ver;
    private RankBean rank;
    private String __Tpl;

    public int getJs_css_date() {
        return js_css_date;
    }

    public String getKg_domain() {
        return kg_domain;
    }

    public String getSrc() {
        return src;
    }

    public Object getFr() {
        return fr;
    }

    public String getVer() {
        return ver;
    }

    public RankBean getRank() {
        return rank;
    }

    public String get__Tpl() {
        return __Tpl;
    }

    @Override
    public String toString() {
        return "RankingListBean{" +
                "js_css_date=" + js_css_date +
                ", kg_domain='" + kg_domain + '\'' +
                ", src='" + src + '\'' +
                ", fr=" + fr +
                ", ver='" + ver + '\'' +
                ", rank=" + rank +
                ", __Tpl='" + __Tpl + '\'' +
                '}';
    }

    public static class RankBean implements Serializable {
        /**
         * total : 26
         * list : [{"rank_cid":58138,"id":2,"rankname":"TOP500","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112175202472916.png","rankid":8888,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019122517263545.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":32350386,"img_9":"","custom_type":0,"ranktype":2,"img_cover":"http://imge.kugou.com/mcommon/{size}/20211117/20211117115003451494.png","issue":66,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019122516438289.jpg","show_play_button":0,"jump_title":"","update_frequency":"每天","classify":1,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220304/20220304145206706097.jpg","intro":"数据来源：全曲库歌曲\r\n排序方式：按歌曲喜爱用户数的总量排序\r\n更新频率：每天","imgurl":"http://imge.kugou.com/mcommon/{size}/20181019/20181019122513972113.jpg"},{"rank_cid":58137,"id":1,"rankname":"飙升榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112175144811731.png","rankid":6666,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20190214/20190214100333414437.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":9861754,"img_9":"","custom_type":0,"ranktype":2,"img_cover":"","issue":66,"banner7url":"http://imge.kugou.com/mcommon/{size}/20190906/20190906162522894877.jpg","show_play_button":0,"jump_title":"","update_frequency":"每天","classify":1,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20150718/20150718150204815336.jpg","intro":"数据来源：全曲库歌曲\r\n排序方式：按歌曲喜爱用户数的涨幅排序\r\n更新频率：每天","imgurl":"http://imge.kugou.com/mcommon/{size}/20190906/20190906162520714932.jpg"},{"rank_cid":58118,"id":309,"rankname":"抖音热歌榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112175327168275.png","rankid":52144,"bannerurl":"","isvol":1,"zone":"tx6_gz_kmr","play_times":11038492,"img_9":"http://imge.kugou.com/mcommon/{size}/20210806/20210806193317751530.png","custom_type":0,"ranktype":1,"img_cover":"","issue":10,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211217/20211217143540832517.png","show_play_button":1,"jump_title":"","update_frequency":"周六","classify":1,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20190414/20190414080844443454.jpg","intro":"数据来源：抖音热门歌曲\r\n排序方式：按照歌曲热度排序\r\n更新频率：每周六","imgurl":"http://imge.kugou.com/mcommon/{size}/20210806/20210806193314611523.png"},{"rank_cid":58184,"id":311,"rankname":"快手热歌榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112175343850884.png","rankid":52767,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20210813/20210813121757693708.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":2773053,"img_9":"http://imge.kugou.com/mcommon/{size}/20211217/20211217143652227085.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":67,"banner7url":"http://imge.kugou.com/mcommon/{size}/20210813/20210813121756176400.jpg","show_play_button":1,"jump_title":"","update_frequency":"每天","classify":1,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20190920/20190920191513148104.jpg","intro":"数据来源：快手热门歌曲\r\n排序方式：按照歌曲热度排序\r\n更新频率：每天","imgurl":"http://imge.kugou.com/mcommon/{size}/20211217/20211217143649962754.jpg"},{"rank_cid":58039,"id":265,"rankname":"说唱先锋榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112185300288680.png","rankid":44412,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20211021/20211021121451321597.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":249069,"img_9":"http://imge.kugou.com/mcommon/{size}/20211015/20211015000041777734.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211021/20211021121450944386.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":1,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211126/20211126152602243273.jpg","intro":"数据来源：说唱歌曲\r\n排序方式：说唱歌曲偏好用户中，按歌曲日均喜爱用户数排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20211015/20211015000039682323.jpg"},{"rank_cid":58139,"id":35,"rankname":"内地榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112175510473796.png","rankid":31308,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019122310609161.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":879335,"img_9":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173236811897.jpg","custom_type":0,"ranktype":1,"img_cover":"http://imge.kugou.com/mcommon/{size}/20211117/20211117114613693049.jpg","issue":46,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173234209146.jpg","show_play_button":0,"jump_title":"","update_frequency":"工作日","classify":2,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220304/20220304145206706097.jpg","intro":"数据来源：30天内发行的内地新歌\r\n排序方式：酷狗音乐的喜爱用户数和发行时间等综合评分排序取前100名\r\n更新频率：每周一至周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173233607609.jpg"},{"rank_cid":58032,"id":119,"rankname":"电音榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112185502385779.png","rankid":33160,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121749428993.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":323096,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172333811545.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121747524588.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":5,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20170207/20170207171928308968.jpg","intro":"数据来源：电音歌曲\r\n排序方式：电音歌曲偏好用户中，按歌曲日均喜爱用户数排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172330443978.jpg"},{"rank_cid":58143,"id":39,"rankname":"香港地区榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112180038607846.png","rankid":31313,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019122021568840.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":180361,"img_9":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173413183246.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":46,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173412988476.jpg","show_play_button":0,"jump_title":"","update_frequency":"工作日","classify":2,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220222/20220222173117680012.jpg","intro":"数据来源：90天内发行的香港地区新歌\r\n排序方式：酷狗音乐的喜爱用户数和发行时间等综合评分排序取前100名\r\n更新频率：每周一至周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173410930698.jpg"},{"rank_cid":58052,"id":297,"rankname":"民谣榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112185421213960.png","rankid":51341,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20210618/20210618141310314738.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":160303,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172410668031.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20210726/20210726153251881781.jpg","show_play_button":1,"jump_title":"","update_frequency":"周三","classify":5,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20150718/20150718142754544803.jpg","intro":"数据来源：用户自建民谣类型歌单中的热门歌曲\r\n排序方式：按照歌曲的热度排名\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172407922177.jpg"},{"rank_cid":58156,"id":315,"rankname":"台湾地区榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112180058808380.png","rankid":54848,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20211110/20211110173748430105.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":19451,"img_9":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173749468229.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":46,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173747430064.jpg","show_play_button":0,"jump_title":"","update_frequency":"工作日","classify":2,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220118/20220118222036520776.jpg","intro":"数据来源：90天内发行的台湾地区新歌\r\n排序方式：酷狗音乐的喜爱用户数和发行时间等综合评分排序取前100名\r\n更新频率：每周一至周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20211110/20211110173745189571.jpg"},{"rank_cid":58034,"id":123,"rankname":"ACG新歌榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112180755701754.png","rankid":33162,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20190911/20190911195359896034.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":25935,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172516840313.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20190911/20190911195358567855.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":5,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220215/20220215211705256096.jpg","intro":"数据来源：120天内发行的ACG新歌\r\n排序方式：按歌曲热度、歌手等级和发行时间综合评分排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110172513187588.jpg"},{"rank_cid":58142,"id":69,"rankname":"日本榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112180343906494.png","rankid":31312,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019122124188716.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":20696,"img_9":"http://imge.kugou.com/mcommon/{size}/20211110/20211110174316588086.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":46,"banner7url":"http://imge.kugou.com/mcommon/{size}/20211110/20211110174314539497.jpg","show_play_button":0,"jump_title":"","update_frequency":"工作日","classify":2,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211216/20211216002435409663.jpg","intro":"数据来源：90天内发行的日本乐坛新歌\r\n排序方式：酷狗音乐的喜爱用户数和发行时间等综合评分排序取前100名\r\n更新频率：每周一至周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20211110/20211110174313329340.jpg"},{"rank_cid":58050,"id":193,"rankname":"欧美金曲榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182840988260.png","rankid":33166,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121546998825.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":288583,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173636666354.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121544655833.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211115/20211115045904772504.jpg","intro":"数据来源：英语/西班牙语/葡萄牙语/法语/德语/德语歌曲\r\n排序方式：按歌曲完整播放日均量排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173632620715.jpg"},{"rank_cid":58035,"id":77,"rankname":"影视金曲榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182855975994.png","rankid":33163,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121704873377.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":124905,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173708277651.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121701875027.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20151228/20151228053106528158.jpg","intro":"数据来源：影视歌曲\r\n排序方式：影视歌曲偏好用户中，按歌曲日均喜爱用户数排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173705332402.jpg"},{"rank_cid":58048,"id":303,"rankname":"重低音榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182931688738.png","rankid":51346,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20210618/20210618142055341871.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":86296,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173825271400.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20210726/20210726153346661772.jpg","show_play_button":1,"jump_title":"","update_frequency":"周三","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20200507/20200507012344117630.jpg","intro":"数据来源：用户自建重低音类型歌单中的热门歌曲\r\n排序方式：按照歌曲的热度排名\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110173822486990.jpg"},{"rank_cid":58144,"id":227,"rankname":"雷达榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112183008512213.png","rankid":37361,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20190808/20190808200005885980.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":175152,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174035666943.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":46,"banner7url":"http://imge.kugou.com/mcommon/{size}/20190808/20190808200003312447.jpg","show_play_button":0,"jump_title":"","update_frequency":"工作日","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220129/20220129174800237317.jpg","intro":"数据来源：浮浮雷达+酷狗听歌识曲\r\n排序方式：按近一周识曲用户数排序\r\n更新频率：每周一至周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174032634577.jpg"},{"rank_cid":58046,"id":275,"rankname":"综艺新歌榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112183043219580.png","rankid":46910,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20201109/20201109170517558959.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":33813,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174144213125.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20201109/20201109170516777658.png","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220131/20220131160903243492.jpg","intro":"数据来源：60天内发行的综艺新歌\r\n排序方式：按歌曲热度、歌手等级和发行时间综合评分排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174141989249.jpg"},{"rank_cid":58157,"id":167,"rankname":"酷狗音乐人原创榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220117/20220117163024782170.png","rankid":30972,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20210125/20210125161120160525.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":24370,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174213907074.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":66,"banner7url":"http://imge.kugou.com/mcommon/{size}/20210125/20210125161119250170.jpg","show_play_button":0,"jump_title":"","update_frequency":"每天","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220227/20220227150320357877.jpg","intro":"数据来源：酷狗原创音乐\r\n排序方式：按播放量、话题热度等维度排序\r\n更新频率：每天","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174210939378.jpg"},{"rank_cid":57997,"id":30,"rankname":"分享榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112183146170638.png","rankid":21101,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121900772347.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":754443,"img_9":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174300312808.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":8,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121858279252.jpg","show_play_button":0,"jump_title":"","update_frequency":"周二","classify":3,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20210919/20210919203701349992.jpg","intro":"数据来源：歌曲分享拉起用户数\r\n排序方式：按点击歌曲分享拉起的用户数排序\r\n更新频率：每周二","imgurl":"http://imge.kugou.com/mcommon/{size}/20220110/20220110174258457920.jpg"},{"rank_cid":58078,"id":10,"rankname":"美国BillBoard榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112181537635196.png","rankid":4681,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121340103598.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":58844,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180224544189.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121339813327.jpg","show_play_button":0,"jump_title":"","update_frequency":"周四","classify":4,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211224/20211224103718958385.jpg","intro":"数据来源：美国Billboard Top100\r\n排序方式：根据歌曲在美国的实体销量、电台播放量、流媒体下载量等指标进行排序\r\n更新频率：每周四","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180223443800.jpg"},{"rank_cid":58056,"id":153,"rankname":"Beatport电子舞曲榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112181554865370.png","rankid":25028,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20170223/20170223182819501244.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":11961,"img_9":"http://imge.kugou.com/mcommon/{size}/20210813/20210813140907176359.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20170223/20170223182818350949.png","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":4,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211204/20211204071606706482.jpg","intro":"数据来源：Beatport音乐网站\r\n排序方式：根据Beatport网站上的播放次数计算排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20210813/20210813140906470933.jpg"},{"rank_cid":58159,"id":12,"rankname":"英国单曲榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112181644889766.png","rankid":4680,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121317188050.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":13907,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180312952034.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":10,"banner7url":"http://imge.kugou.com/mcommon/{size}/20181019/20181019121316839345.jpg","show_play_button":0,"jump_title":"","update_frequency":"周一","classify":4,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211224/20211224103718958385.jpg","intro":"数据来源：英国Single Chart Top 40\r\n排序方式：根据歌曲在英国的一周销量进行排序\r\n更新频率：每周一","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180311445477.jpg"},{"rank_cid":58160,"id":9,"rankname":"韩国Melon音乐榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112181946586976.png","rankid":38623,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019121225649566.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":14705,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180514209064.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":10,"banner7url":"http://imge.kugou.com/mcommon/{size}/20191021/20191021201705225728.jpg","show_play_button":0,"jump_title":"","update_frequency":"周一","classify":4,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20211208/20211208163907496371.jpg","intro":"数据来源：韩国Melon\r\n排序方式：根据Melon的销售、下载、播放等指标进行排序\r\n更新频率：每周一","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180513682585.jpg"},{"rank_cid":58103,"id":251,"rankname":"joox本地热歌榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182022801936.png","rankid":42807,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20200320/20200320185608883318.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":8993,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180413341778.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20200320/20200320185607939528.jpg","show_play_button":0,"jump_title":"","update_frequency":"周五","classify":4,"album_img_9":"http://imge.kugou.com/stdmusic/{size}/20220128/20220128124933403824.jpg","intro":"数据来源：JOOX平台\r\n排序方式：根据JOOX播放等指标进行排序\r\n更新频率：每周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180412417965.jpg"},{"rank_cid":58053,"id":273,"rankname":"日本SPACE SHOWER榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182338294233.png","rankid":46868,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20201028/20201028152647239085.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":1565,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180947808622.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":8,"banner7url":"http://imge.kugou.com/mcommon/{size}/20201028/20201028152646615355.jpg","show_play_button":0,"jump_title":"","update_frequency":"周三","classify":4,"album_img_9":"http://singerimg.kugou.com/uploadpic/softhead/{size}/20201124/20201124173440196.jpg","intro":"数据来源：日本音乐频道 SPACE SHOWER TV\r\n排序方式：根据SPACE SHOWER频道上的播放次数计算排序\r\n更新频率：每周三","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180946131853.jpg"},{"rank_cid":58104,"id":253,"rankname":"KKBOX风云榜","jump_url":"","banner_9":"http://imge.kugou.com/mcommon/{size}/20220112/20220112182509814250.png","rankid":42808,"bannerurl":"http://imge.kugou.com/mcommonbanner/{size}/20210310/20210310161810367993.jpg","isvol":1,"zone":"tx6_gz_kmr","play_times":4147,"img_9":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180834806222.jpg","custom_type":0,"ranktype":1,"img_cover":"","issue":9,"banner7url":"http://imge.kugou.com/mcommon/{size}/20210310/20210310161809747097.jpg","show_play_button":0,"jump_title":"","update_frequency":"周五","classify":4,"album_img_9":"","intro":"数据来源：KKBOX平台\r\n排序方式：根据KKBOX播放等指标进行排序\r\n更新频率：每周五","imgurl":"http://imge.kugou.com/mcommon/{size}/20210319/20210319180832806920.jpg"}]
         */

        private int total;
        private List<ListBean> list;

        public int getTotal() {
            return total;
        }

        public List<ListBean> getList() {
            return list;
        }

        @Override
        public String toString() {
            return "RankBean{" +
                    "total=" + total +
                    ", list=" + list +
                    '}';
        }

        public static class ListBean implements Serializable {
            public int getRank_cid() {
                return rank_cid;
            }

            @Override
            public String toString() {
                return "ListBean{" +
                        "rank_cid=" + rank_cid +
                        ", id=" + id +
                        ", rankname='" + rankname + '\'' +
                        ", jump_url='" + jump_url + '\'' +
                        ", banner_9='" + banner_9 + '\'' +
                        ", rankid=" + rankid +
                        ", bannerurl='" + bannerurl + '\'' +
                        ", isvol=" + isvol +
                        ", zone='" + zone + '\'' +
                        ", play_times=" + play_times +
                        ", img_9='" + img_9 + '\'' +
                        ", custom_type=" + custom_type +
                        ", ranktype=" + ranktype +
                        ", img_cover='" + img_cover + '\'' +
                        ", issue=" + issue +
                        ", banner7url='" + banner7url + '\'' +
                        ", show_play_button=" + show_play_button +
                        ", jump_title='" + jump_title + '\'' +
                        ", update_frequency='" + update_frequency + '\'' +
                        ", classify=" + classify +
                        ", album_img_9='" + album_img_9 + '\'' +
                        ", intro='" + intro + '\'' +
                        ", imgurl='" + imgurl + '\'' +
                        '}';
            }

            public int getId() {
                return id;
            }

            public String getRankname() {
                return rankname;
            }

            public String getJump_url() {
                return jump_url;
            }

            public String getBanner_9() {
                return banner_9;
            }

            public int getRankid() {
                return rankid;
            }

            public String getBannerurl() {
                return bannerurl;
            }

            public int getIsvol() {
                return isvol;
            }

            public String getZone() {
                return zone;
            }

            public int getPlay_times() {
                return play_times;
            }

            public String getImg_9() {
                return img_9;
            }

            public int getCustom_type() {
                return custom_type;
            }

            public int getRanktype() {
                return ranktype;
            }

            public String getImg_cover() {
                return img_cover;
            }

            public int getIssue() {
                return issue;
            }

            public String getBanner7url() {
                return banner7url;
            }

            public int getShow_play_button() {
                return show_play_button;
            }

            public String getJump_title() {
                return jump_title;
            }

            public String getUpdate_frequency() {
                return update_frequency;
            }

            public int getClassify() {
                return classify;
            }

            public String getAlbum_img_9() {
                return album_img_9;
            }

            public String getIntro() {
                return intro;
            }

            public String getImgurl() {
                return imgurl;
            }

            /**
             * rank_cid : 58138
             * id : 2
             * rankname : TOP500
             * jump_url :
             * banner_9 : http://imge.kugou.com/mcommon/{size}/20220112/20220112175202472916.png
             * rankid : 8888
             * bannerurl : http://imge.kugou.com/mcommonbanner/{size}/20181019/20181019122517263545.jpg
             * isvol : 1
             * zone : tx6_gz_kmr
             * play_times : 32350386
             * img_9 :
             * custom_type : 0
             * ranktype : 2
             * img_cover : http://imge.kugou.com/mcommon/{size}/20211117/20211117115003451494.png
             * issue : 66
             * banner7url : http://imge.kugou.com/mcommon/{size}/20181019/20181019122516438289.jpg
             * show_play_button : 0
             * jump_title :
             * update_frequency : 每天
             * classify : 1
             * album_img_9 : http://imge.kugou.com/stdmusic/{size}/20220304/20220304145206706097.jpg
             * intro : 数据来源：全曲库歌曲
             排序方式：按歌曲喜爱用户数的总量排序
             更新频率：每天
             * imgurl : http://imge.kugou.com/mcommon/{size}/20181019/20181019122513972113.jpg
             */

            private int rank_cid;
            private int id;
            private String rankname;
            private String jump_url;
            private String banner_9;
            private int rankid;
            private String bannerurl;
            private int isvol;
            private String zone;
            private int play_times;
            private String img_9;
            private int custom_type;
            private int ranktype;
            private String img_cover;
            private int issue;
            private String banner7url;
            private int show_play_button;
            private String jump_title;
            private String update_frequency;
            private int classify;
            private String album_img_9;
            private String intro;
            private String imgurl;
        }
    }
}
