package com.example.cloudmusic.ui.homepage.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class RecommendMusicBean implements Serializable {
    @Override
    public String toString() {
        return "RecommendMusicBean{" +
                "code=" + code +
                ", color=" + color +
                ", comment_num=" + comment_num +
                ", cur_song_num=" + cur_song_num +
                ", date='" + date + '\'' +
                ", day_of_year='" + day_of_year + '\'' +
                ", song_begin=" + song_begin +
                ", topinfo=" + topinfo +
                ", total_song_num=" + total_song_num +
                ", update_time='" + update_time + '\'' +
                ", songlist=" + songlist +
                '}';
    }

    /**
     * code : 0
     * color : 5001011
     * comment_num : 603
     * cur_song_num : 55
     * date : 2022_9
     * day_of_year :
     * song_begin : 0
     * songlist : [{"Franking_value":"1","cur_count":"1","data":{"albumdesc":"《英雄联盟：双城之战》动画剧集中文主题曲","albumid":23277502,"albummid":"001uaPM93kxk1R","albumname":"孤勇者","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":256,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":80768,"tryend":116032,"trysize":960887},"rate":23,"singer":[{"id":143,"mid":"003Nz2So3XXYek","name":"陈奕迅"}],"size128":4097029,"size320":10242283,"size5_1":0,"sizeape":0,"sizeflac":28729027,"sizeogg":5558885,"songid":331839675,"songmid":"003UkWuI0E8U0l","songname":"孤勇者","songorig":"孤勇者","songtype":0,"strMediaMid":"003UkWuI0E8U0l","stream":1,"switch":16888579,"type":0,"vid":"y0041ywgpm7"},"in_count":"14","old_count":"1"},{"Franking_value":"1","cur_count":"2","data":{"albumdesc":"《我要我们在一起》电影主题曲","albumid":19502252,"albummid":"001fN0ks2oUDvX","albumname":"这世界那么多人","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":285,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":960887},"rate":23,"singer":[{"id":54,"mid":"000cISVf2QqLc6","name":"莫文蔚"}],"size128":4574773,"size320":11436618,"size5_1":0,"sizeape":0,"sizeflac":25863089,"sizeogg":5709501,"songid":309058164,"songmid":"000EId433wXlQN","songname":"这世界那么多人","songorig":"这世界那么多人","songtype":0,"strMediaMid":"003vBf2p2G5Htk","stream":1,"switch":16889603,"type":0,"vid":"o003679d7oa"},"in_count":"38","old_count":"2"},{"Franking_value":"3","cur_count":"3","data":{"albumdesc":"","albumid":6309756,"albummid":"000Vwygr4Y8BPi","albumname":"哪里都是你","alertid":2,"belongCD":1,"cdIdx":0,"icons":8527740,"interval":222,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":58916,"tryend":85688,"trysize":0},"rate":23,"singer":[{"id":2150959,"mid":"002rHyN14UyyaW","name":"队长"}],"size128":3564138,"size320":8910045,"size5_1":0,"sizeape":0,"sizeflac":24705306,"sizeogg":5097377,"songid":229103825,"songmid":"000DwlYJ09mLoO","songname":"哪里都是你","songorig":"哪里都是你","songtype":0,"strMediaMid":"003bFUaM0zmS7U","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"34","old_count":"3"},{"Franking_value":"2","cur_count":"4","data":{"albumdesc":"","albumid":456882,"albummid":"000GvdTR0qcKh8","albumname":"危险世界","alertid":2,"belongCD":7,"cdIdx":0,"icons":8527740,"interval":259,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":67834,"tryend":105256,"trysize":960887},"rate":23,"singer":[{"id":1066,"mid":"003zHcYF44FVEV","name":"方大同"}],"size128":4146353,"size320":10365585,"size5_1":0,"sizeape":0,"sizeflac":27091764,"sizeogg":5598122,"songid":5293866,"songmid":"003cSLOO35W3yP","songname":"特别的人","songorig":"特别的人","songtype":0,"strMediaMid":"00159wc43VgTEW","stream":1,"switch":16889603,"type":0,"vid":"h0014hbnffi"},"in_count":"43","old_count":"4"},{"Franking_value":"2","cur_count":"5","data":{"albumdesc":"","albumid":12979945,"albummid":"003JbcCj0BKtoz","albumname":"1st.星球","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":334,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":960887},"rate":23,"singer":[{"id":967459,"mid":"00257xNB06Ucx6","name":"柳爽"}],"size128":5349241,"size320":13372804,"size5_1":0,"sizeape":0,"sizeflac":34239578,"sizeogg":7313314,"songid":268686156,"songmid":"0043nSjv1TtpMv","songname":"漠河舞厅","songorig":"漠河舞厅","songtype":0,"strMediaMid":"0043nSjv1TtpMv","stream":1,"switch":16889603,"type":0,"vid":"p0040ejvuh3"},"in_count":"17","old_count":"5"},{"Franking_value":"7","cur_count":"6","data":{"albumdesc":"","albumid":24360701,"albummid":"001en2Lq0PZK7i","albumname":"从前说","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":251,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":74454,"tryend":113056,"trysize":0},"rate":23,"singer":[{"id":3127723,"mid":"000DT3kC3IGHjR","name":"小阿七"}],"size128":4025141,"size320":10062314,"size5_1":0,"sizeape":0,"sizeflac":30547297,"sizeogg":5573791,"songid":337805783,"songmid":"003yLGL81rAVzJ","songname":"从前说","songorig":"从前说","songtype":0,"strMediaMid":"002MxEPT1eCYhg","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"6","old_count":"7"},{"Franking_value":"6","cur_count":"7","data":{"albumdesc":"","albumid":16949818,"albummid":"001MyK3Y47zLur","albumname":"一路生花","alertid":2,"belongCD":1,"cdIdx":0,"icons":8527740,"interval":256,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":0},"rate":23,"singer":[{"id":1387449,"mid":"003k64X11As4qX","name":"温奕心"}],"size128":4101213,"size320":10252736,"size5_1":0,"sizeape":0,"sizeflac":28321807,"sizeogg":5762396,"songid":294095266,"songmid":"004AxmlM3YihD2","songname":"一路生花","songorig":"一路生花","songtype":0,"strMediaMid":"001y6GqB07XIjq","stream":1,"switch":16889603,"type":0,"vid":"n0041y2al9o"},"in_count":"14","old_count":"6"},{"Franking_value":"7","cur_count":"8","data":{"albumdesc":"","albumid":36062,"albummid":"002Neh8l0uciQZ","albumname":"魔杰座","alertid":41,"belongCD":4,"cdIdx":0,"icons":12861438,"interval":264,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":960887},"rate":23,"singer":[{"id":4558,"mid":"0025NhlN2yWrP4","name":"周杰伦"}],"size128":4234954,"size320":10586796,"size5_1":0,"sizeape":0,"sizeflac":30665375,"sizeogg":5637352,"songid":449198,"songmid":"003cI52o4daJJL","songname":"花海","songorig":"花海","songtype":0,"strMediaMid":"003Gdiea1ExCoO","stream":1,"switch":16897281,"type":0,"vid":"r00127x0yzd"},"in_count":"57","old_count":"8"},{"Franking_value":"6","cur_count":"9","data":{"albumdesc":"","albumid":1699898,"albummid":"0016jBpl0vMqbb","albumname":"水星记","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":325,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":80140,"tryend":118712,"trysize":0},"rate":23,"singer":[{"id":4418,"mid":"0002ankM4d5yZI","name":"郭顶"}],"size128":5205455,"size320":13013351,"size5_1":0,"sizeape":0,"sizeflac":29149085,"sizeogg":6690451,"songid":109291468,"songmid":"00485V8K4InqbZ","songname":"水星记","songorig":"水星记","songtype":0,"strMediaMid":"003E5JA43t5qgZ","stream":1,"switch":16888579,"type":0,"vid":"g0022gqovuy"},"in_count":"111","old_count":"11"},{"Franking_value":"2","cur_count":"10","data":{"albumdesc":"","albumid":194021,"albummid":"003Ow85E3pnoqi","albumname":"十二新作","alertid":41,"belongCD":4,"cdIdx":0,"icons":12861438,"interval":260,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":68261,"tryend":102074,"trysize":960887},"rate":23,"singer":[{"id":4558,"mid":"0025NhlN2yWrP4","name":"周杰伦"}],"size128":4167249,"size320":10417329,"size5_1":0,"sizeape":0,"sizeflac":27658991,"sizeogg":5687035,"songid":3585884,"songmid":"000oW8J53xPhZA","songname":"明明就","songorig":"明明就","songtype":0,"strMediaMid":"001mxHU44PEhTP","stream":1,"switch":16897281,"type":0,"vid":"o00117sxevp"},"in_count":"47","old_count":"9"},{"Franking_value":"9","cur_count":"11","data":{"albumdesc":"","albumid":22680980,"albummid":"000l2wUJ0SaXrC","albumname":"2021中国好声音 第12期","alertid":22,"belongCD":6,"cdIdx":0,"icons":12992510,"interval":224,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":68345,"tryend":95005,"trysize":960887},"rate":23,"singer":[{"id":6016498,"mid":"002YetSZ06c9c9","name":"王靖雯"}],"size128":3590915,"size320":8976946,"size5_1":0,"sizeape":0,"sizeflac":22738705,"sizeogg":4510246,"songid":328158882,"songmid":"001kWhWV0CkNhb","songname":"说说话 (Live)","songorig":"说说话","songtype":0,"strMediaMid":"001kWhWV0CkNhb","stream":1,"switch":16897281,"type":0,"vid":"k0040kn34j2"},"in_count":"13","old_count":"10"},{"Franking_value":"26","cur_count":"12","data":{"albumdesc":"","albumid":87747,"albummid":"001aC9dM35U6KB","albumname":"说到爱","alertid":22,"belongCD":8,"cdIdx":0,"icons":12992510,"interval":263,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":960887},"rate":23,"singer":[{"id":112,"mid":"000hNnWC3kko2c","name":"蔡健雅"}],"size128":4216580,"size320":10541138,"size5_1":0,"sizeape":0,"sizeflac":30927477,"sizeogg":6049985,"songid":1030353,"songmid":"004aJoYT3ia7al","songname":"Letting Go","songorig":"Letting Go","songtype":0,"strMediaMid":"003BjBI80c1f6f","stream":1,"switch":16897281,"type":0,"vid":"d0024ro2pbh"},"in_count":"2","old_count":"26"},{"Franking_value":"13","cur_count":"13","data":{"albumdesc":"《我和我的父辈》电影主题推广曲","albumid":22364673,"albummid":"004Kbn3m2HV9Y3","albumname":"如愿","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":265,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":54283,"tryend":90226,"trysize":960887},"rate":23,"singer":[{"id":264,"mid":"000GDDuQ3sGQiT","name":"王菲"}],"size128":4247489,"size320":10618441,"size5_1":0,"sizeape":0,"sizeflac":25324985,"sizeogg":5757656,"songid":326584182,"songmid":"001ufyHx10iWpg","songname":"如愿","songorig":"如愿","songtype":0,"strMediaMid":"001ufyHx10iWpg","stream":1,"switch":16889603,"type":0,"vid":"c00403pcs8l"},"in_count":"17","old_count":"13"},{"Franking_value":"1","cur_count":"14","data":{"albumdesc":"《前任3：再见前任》电影插曲","albumid":3827222,"albummid":"001qYTzY2oyDyZ","albumname":"体面","alertid":2,"belongCD":1,"cdIdx":0,"icons":8527740,"interval":282,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":89005,"tryend":135712,"trysize":960887},"rate":23,"singer":[{"id":67008,"mid":"000poF8D027tPr","name":"于文文"}],"size128":4525434,"size320":11313071,"size5_1":0,"sizeape":0,"sizeflac":27226341,"sizeogg":6118812,"songid":212606735,"songmid":"000Md1wq0vnwzE","songname":"体面","songorig":"体面","songtype":0,"strMediaMid":"001kMEcr1vxQW0","stream":1,"switch":16889603,"type":0,"vid":"c0025c297rz"},"in_count":"111","old_count":"12"},{"Franking_value":"1","cur_count":"15","data":{"albumdesc":"","albumid":16579177,"albummid":"000dt9Py0BrReK","albumname":"白月光与朱砂痣","alertid":2,"belongCD":1,"cdIdx":0,"icons":8527740,"interval":204,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":0},"rate":23,"singer":[{"id":2716679,"mid":"002sT7040IAT6z","name":"大籽"}],"size128":3268648,"size320":8171310,"size5_1":0,"sizeape":0,"sizeflac":23128164,"sizeogg":4637123,"songid":291911135,"songmid":"002iqQ4I1wyB7L","songname":"白月光与朱砂痣","songorig":"白月光与朱砂痣","songtype":0,"strMediaMid":"002A6u6019HpaZ","stream":1,"switch":16889603,"type":0,"vid":"n0036uxu7l1"},"in_count":"60","old_count":"14"},{"Franking_value":"16","cur_count":"16","data":{"albumdesc":"","albumid":11043864,"albummid":"000oM4bw2TUQq7","albumname":"门没锁","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":194,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":71455,"tryend":105815,"trysize":0},"rate":23,"singer":[{"id":5348048,"mid":"004TX6pl1T9JAH","name":"我是土豆"}],"size128":3119007,"size320":7797224,"size5_1":0,"sizeape":0,"sizeflac":21238445,"sizeogg":4354335,"songid":256208052,"songmid":"000JJMFo132IFJ","songname":"门没锁","songorig":"门没锁","songtype":0,"strMediaMid":"000j7OKO1UuvRN","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"6","old_count":"16"},{"Franking_value":"2","cur_count":"17","data":{"albumdesc":"《后来的我们》电影彩蛋歌曲","albumid":96218,"albummid":"0017zqT34WuQwa","albumname":"我等你","alertid":21,"belongCD":2,"cdIdx":0,"icons":8535932,"interval":341,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":0},"rate":23,"singer":[{"id":51,"mid":"003jJGvv3C82KZ","name":"刘若英"}],"size128":5463754,"size320":13658913,"size5_1":0,"sizeape":0,"sizeflac":39049298,"sizeogg":8084534,"songid":4830150,"songmid":"000XeLXA3X8CTH","songname":"后来","songorig":"后来","songtype":0,"strMediaMid":"000ImmUb1tGQb8","stream":1,"switch":16889603,"type":0,"vid":"l0012mf2nkr"},"in_count":"111","old_count":"15"},{"Franking_value":"5","cur_count":"18","data":{"albumdesc":"","albumid":20612,"albummid":"003DFRzD192KKD","albumname":"七里香","alertid":41,"belongCD":2,"cdIdx":0,"icons":12861438,"interval":299,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":80683,"tryend":135203,"trysize":960887},"rate":23,"singer":[{"id":4558,"mid":"0025NhlN2yWrP4","name":"周杰伦"}],"size128":4788294,"size320":11970297,"size5_1":0,"sizeape":0,"sizeflac":35845646,"sizeogg":7078399,"songid":102065756,"songmid":"004Z8Ihr0JIu5s","songname":"七里香","songorig":"七里香","songtype":0,"strMediaMid":"0012Ez0a1tFcOI","stream":1,"switch":16897281,"type":0,"vid":"k0013x8ao6z"},"in_count":"111","old_count":"18"},{"Franking_value":"2","cur_count":"19","data":{"albumdesc":"","albumid":15898377,"albummid":"003QU3EZ3Sfm6B","albumname":"阿拉斯加海湾","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":237,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":0},"rate":23,"singer":[{"id":2614601,"mid":"003Rc7tU01TXKL","name":"蓝心羽"}],"size128":3793603,"size320":9483700,"size5_1":0,"sizeape":0,"sizeflac":25341432,"sizeogg":5030375,"songid":287881671,"songmid":"002FHVgG4btehE","songname":"阿拉斯加海湾","songorig":"阿拉斯加海湾","songtype":0,"strMediaMid":"002vQNdd3ThLy6","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"58","old_count":"17"},{"Franking_value":"2","cur_count":"20","data":{"albumdesc":"","albumid":951982,"albummid":"004GArUe26PXvZ","albumname":"如也","alertid":21,"belongCD":3,"cdIdx":0,"icons":8535932,"interval":253,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":54426,"tryend":122839,"trysize":0},"rate":23,"singer":[{"id":940748,"mid":"004WgCsE3KBddt","name":"陈粒"}],"size128":4050636,"size320":10126300,"size5_1":0,"sizeape":0,"sizeflac":24049275,"sizeogg":5244171,"songid":102068222,"songmid":"001j7B3Z4Ixe9X","songname":"奇妙能力歌","songorig":"奇妙能力歌","songtype":0,"strMediaMid":"003QxEg83QZ9Mh","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"111","old_count":"19"},{"Franking_value":"8","cur_count":"21","data":{"albumdesc":"","albumid":8036,"albummid":"000y5gq7449K9I","albumname":"第二天堂","alertid":22,"belongCD":6,"cdIdx":0,"icons":12992510,"interval":267,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":83866,"tryend":119108,"trysize":960887},"rate":23,"singer":[{"id":4286,"mid":"001BLpXF2DyJe2","name":"林俊杰"}],"size128":4288455,"size320":10720847,"size5_1":0,"sizeape":0,"sizeflac":31386542,"sizeogg":6600445,"songid":9063002,"songmid":"004TXEXY2G2c7C","songname":"江南","songorig":"江南","songtype":0,"strMediaMid":"003NikJo0a0uzm","stream":1,"switch":16897281,"type":0,"vid":"b0013k1imsl"},"in_count":"68","old_count":"22"},{"Franking_value":"8","cur_count":"22","data":{"albumdesc":"","albumid":23156335,"albummid":"004SjWnA1NcK5d","albumname":"指纹","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":240,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":63146,"tryend":94997,"trysize":0},"rate":23,"singer":[{"id":1260091,"mid":"002cOLQe4GKkzg","name":"杜宣达"}],"size128":3845414,"size320":9613251,"size5_1":0,"sizeape":0,"sizeflac":25072957,"sizeogg":5291662,"songid":331264584,"songmid":"000HTbQv2OHqYi","songname":"指纹","songorig":"指纹","songtype":0,"strMediaMid":"000HTbQv2OHqYi","stream":1,"switch":16889603,"type":0,"vid":"u0041vbq2j1"},"in_count":"15","old_count":"21"},{"Franking_value":"25","cur_count":"23","data":{"albumdesc":"","albumid":96364,"albummid":"0032RdHK1BjYgy","albumname":"门没锁","alertid":21,"belongCD":3,"cdIdx":0,"icons":8535932,"interval":236,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":50309,"tryend":83566,"trysize":960887},"rate":23,"singer":[{"id":59,"mid":"001reYD01YuOQ8","name":"品冠"}],"size128":3786484,"size320":9465922,"size5_1":0,"sizeape":0,"sizeflac":29794341,"sizeogg":6035311,"songid":4932386,"songmid":"004SvsEC3ej1OP","songname":"门没锁","songorig":"门没锁","songtype":0,"strMediaMid":"003lNP0X4GjsVY","stream":1,"switch":16889603,"type":0,"vid":"a0013ikcwdn"},"in_count":"5","old_count":"25"},{"Franking_value":"23","cur_count":"24","data":{"albumdesc":"","albumid":22172561,"albummid":"001NRUEr1kqBSo","albumname":"危险派对","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":180,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":56342,"tryend":75348,"trysize":960887},"rate":7,"singer":[{"id":949559,"mid":"002iHA5S4LdDjr","name":"王以太"},{"id":198596,"mid":"002YRzYC2hbgDT","name":"刘至佳"}],"size128":2890385,"size320":7225582,"size5_1":0,"sizeape":0,"sizeflac":0,"sizeogg":4098459,"songid":324803060,"songmid":"004R7qfh1ALctJ","songname":"危险派对","songorig":"危险派对","songtype":0,"strMediaMid":"000RpSuw2wDbXw","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"17","old_count":"23"},{"Franking_value":"1","cur_count":"25","data":{"albumdesc":"","albumid":20403568,"albummid":"001T2RcR3uZ1ju","albumname":"最后的人","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":248,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":57491,"tryend":105801,"trysize":0},"rate":23,"singer":[{"id":1573020,"mid":"0007gcR612qKgE","name":"杨小壮"}],"size128":3972482,"size320":9930908,"size5_1":0,"sizeape":0,"sizeflac":24819239,"sizeogg":5804923,"songid":314744313,"songmid":"000Azl7N42BY7d","songname":"最后的人","songorig":"最后的人","songtype":0,"strMediaMid":"000Azl7N42BY7d","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"32","old_count":"24"},{"Franking_value":"13","cur_count":"26","data":{"albumdesc":"","albumid":20612,"albummid":"003DFRzD192KKD","albumname":"七里香","alertid":41,"belongCD":6,"cdIdx":0,"icons":12861438,"interval":240,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":60964,"tryend":94382,"trysize":960887},"rate":23,"singer":[{"id":4558,"mid":"0025NhlN2yWrP4","name":"周杰伦"}],"size128":3843167,"size320":9607864,"size5_1":0,"sizeape":0,"sizeflac":26174554,"sizeogg":5218730,"songid":102065750,"songmid":"001Bbywq2gicae","songname":"搁浅","songorig":"搁浅","songtype":0,"strMediaMid":"004UlK9x0jeuow","stream":1,"switch":16897281,"type":0,"vid":"x00135ao69x"},"in_count":"76","old_count":"27"},{"Franking_value":"17","cur_count":"27","data":{"albumdesc":"联想idea Pad S9/S10笔记本主题曲","albumid":36160,"albummid":"002g6zv02X7SNi","albumname":"JJ陆","alertid":22,"belongCD":7,"cdIdx":0,"icons":12992510,"interval":225,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":960887},"rate":23,"singer":[{"id":4286,"mid":"001BLpXF2DyJe2","name":"林俊杰"}],"size128":3601350,"size320":9003055,"size5_1":0,"sizeape":0,"sizeflac":25185263,"sizeogg":5285064,"songid":447257,"songmid":"001N8e5Q4Gjxda","songname":"Always Online","songorig":"Always Online","songtype":0,"strMediaMid":"001gRiqC0dCS2q","stream":1,"switch":16897281,"type":0,"vid":"c0024gk06gr"},"in_count":"50","old_count":"28"},{"Franking_value":"18","cur_count":"28","data":{"albumdesc":"","albumid":33021,"albummid":"002eFUFm2XYZ7z","albumname":"我很忙","alertid":41,"belongCD":3,"cdIdx":0,"icons":12861438,"interval":239,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":56949,"tryend":91395,"trysize":960887},"rate":23,"singer":[{"id":4558,"mid":"0025NhlN2yWrP4","name":"周杰伦"}],"size128":3830789,"size320":9576656,"size5_1":0,"sizeape":0,"sizeflac":26170419,"sizeogg":5414761,"songid":410316,"songmid":"002qU5aY3Qu24y","songname":"青花瓷","songorig":"青花瓷","songtype":0,"strMediaMid":"0015zR8B3gjJLl","stream":1,"switch":16897281,"type":0,"vid":"l00131om505"},"in_count":"71","old_count":"30"},{"Franking_value":"32","cur_count":"29","data":{"albumdesc":"","albumid":23705368,"albummid":"002UeTiF1TeKY3","albumname":"漠河舞厅","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":213,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":0},"rate":23,"singer":[{"id":3158196,"mid":"001yfOTl2jS0xm","name":"戴羽彤"}],"size128":3422447,"size320":8555822,"size5_1":0,"sizeape":0,"sizeflac":23405067,"sizeogg":4869981,"songid":334436138,"songmid":"001h4Gdc1gdvPT","songname":"漠河舞厅","songorig":"漠河舞厅","songtype":0,"strMediaMid":"001h4Gdc1gdvPT","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"5","old_count":"32"},{"Franking_value":"20","cur_count":"30","data":{"albumdesc":"","albumid":23938059,"albummid":"0023Qvzf3fhdlX","albumname":"叹","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":251,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":0},"rate":23,"singer":[{"id":11476,"mid":"003AKgLE4SfjsK","name":"黄龄"},{"id":7365656,"mid":"000QaXhu4MF2K6","name":"Tăng Duy Tân"}],"size128":4026384,"size320":10065686,"size5_1":0,"sizeape":0,"sizeflac":30418133,"sizeogg":5702751,"songid":335635056,"songmid":"003X4iNb0Jcd4X","songname":"叹","songorig":"叹","songtype":0,"strMediaMid":"000cFbj12hpdo1","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"7","old_count":"20"},{"Franking_value":"23","cur_count":"31","data":{"albumdesc":"原曲：《ヤキモチ》\u2014高桥优","albumid":2066015,"albummid":"003j3NMw1ZBpsv","albumname":"起风了 (原版)","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":312,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":0},"rate":7,"singer":[{"id":1481170,"mid":"00210cxa3CNkFg","name":"买辣椒也用券"}],"size128":5007779,"size320":12519132,"size5_1":0,"sizeape":0,"sizeflac":0,"sizeogg":5942060,"songid":202371397,"songmid":"0004jPDk2eB2dt","songname":"起风了","songorig":"起风了","songtype":0,"strMediaMid":"0039f4Dv2l1Xo2","stream":1,"switch":16889603,"type":0,"vid":"f00365g6fyc"},"in_count":"6","old_count":"29"},{"Franking_value":"10","cur_count":"32","data":{"albumdesc":"","albumid":421264,"albummid":"001gqOnU3DTg2S","albumname":"因你 而在","alertid":22,"belongCD":4,"cdIdx":0,"icons":12992510,"interval":287,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":46132,"tryend":102697,"trysize":960887},"rate":23,"singer":[{"id":4286,"mid":"001BLpXF2DyJe2","name":"林俊杰"}],"size128":4593151,"size320":11482581,"size5_1":0,"sizeape":0,"sizeflac":33112408,"sizeogg":6544206,"songid":5063375,"songmid":"002CxSLT41D5tD","songname":"修炼爱情","songorig":"修炼爱情","songtype":0,"strMediaMid":"00243Hk31cqoHG","stream":1,"switch":16897281,"type":0,"vid":"g0011qp6w2g"},"in_count":"101","old_count":"33"},{"Franking_value":"34","cur_count":"33","data":{"albumdesc":"","albumid":20862104,"albummid":"000SMqxe1E09mw","albumname":"哪里都是你","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":48,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":0},"rate":23,"singer":[{"id":8807165,"mid":"000eiYVp1yhE9d","name":"四夕雨日斤"}],"size128":782207,"size320":1955210,"size5_1":0,"sizeape":0,"sizeflac":2724809,"sizeogg":856861,"songid":316895776,"songmid":"001fkFEc3Exum6","songname":"哪里都是你 (Demo)","songorig":"哪里都是你","songtype":0,"strMediaMid":"002gxgJy4QG9yr","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"8","old_count":"34"},{"Franking_value":"6","cur_count":"34","data":{"albumdesc":"《我们与恶的距离》电视剧插曲","albumid":6945079,"albummid":"004NkJKq0GkHOa","albumname":"路过人间","alertid":41,"belongCD":1,"cdIdx":0,"icons":12992510,"interval":245,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":43121,"tryend":75393,"trysize":960887},"rate":23,"singer":[{"id":19624,"mid":"000NUoMp2WAEpO","name":"郁可唯"}],"size128":3935701,"size320":9838957,"size5_1":0,"sizeape":0,"sizeflac":25797383,"sizeogg":5361976,"songid":232965795,"songmid":"0042jyJt0aQ0Gd","songname":"路过人间","songorig":"路过人间","songtype":0,"strMediaMid":"0042jyJt0aQ0Gd","stream":1,"switch":16897281,"type":0,"vid":"z0031dc82xm"},"in_count":"17","old_count":"31"},{"Franking_value":"34","cur_count":"35","data":{"albumdesc":"","albumid":96340,"albummid":"004NULY81IePWm","albumname":"Love & the City","alertid":21,"belongCD":2,"cdIdx":0,"icons":8535932,"interval":250,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":74455,"tryend":101705,"trysize":0},"rate":23,"singer":[{"id":51,"mid":"003jJGvv3C82KZ","name":"刘若英"}],"size128":4013884,"size320":10034377,"size5_1":0,"sizeape":0,"sizeflac":27392576,"sizeogg":5656666,"songid":4830211,"songmid":"000SGl2m1jfQJX","songname":"当爱在靠近","songorig":"当爱在靠近","songtype":0,"strMediaMid":"002jQax92pr5Or","stream":1,"switch":16889603,"type":0,"vid":"9OuyIrvF6aM"},"in_count":"10","old_count":"35"},{"Franking_value":"6","cur_count":"36","data":{"albumdesc":"","albumid":96613,"albummid":"003q2Hji2dzAyI","albumname":"就是 莫文蔚","alertid":21,"belongCD":8,"cdIdx":0,"icons":8535932,"interval":201,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":45516,"tryend":74202,"trysize":0},"rate":23,"singer":[{"id":54,"mid":"000cISVf2QqLc6","name":"莫文蔚"}],"size128":3228100,"size320":8069949,"size5_1":0,"sizeape":0,"sizeflac":19993433,"sizeogg":4619801,"songid":4830362,"songmid":"000B0ypt0gL3vR","songname":"忽然之间","songorig":"忽然之间","songtype":0,"strMediaMid":"001ri0mQ1w3Vau","stream":1,"switch":16889603,"type":0,"vid":"c0011zltyen"},"in_count":"111","old_count":"37"},{"Franking_value":"5","cur_count":"37","data":{"albumdesc":"","albumid":1666157,"albummid":"000jE4g74VS43p","albumname":"无法长大","alertid":21,"belongCD":6,"cdIdx":0,"icons":8535932,"interval":328,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":1,"payalbumprice":1600,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":83160,"tryend":116143,"trysize":0},"rate":23,"singer":[{"id":40449,"mid":"001Lr98T0yEWAk","name":"赵雷"}],"size128":5249759,"size320":13124110,"size5_1":0,"sizeape":0,"sizeflac":32010277,"sizeogg":7041700,"songid":108963136,"songmid":"001bhwUC1gE6ep","songname":"成都","songorig":"成都","songtype":0,"strMediaMid":"002JJDz72hlzKw","stream":1,"switch":16889603,"type":0,"vid":"m00244ktl0u"},"in_count":"111","old_count":"38"},{"Franking_value":"3","cur_count":"38","data":{"albumdesc":"","albumid":15187273,"albummid":"00498Sbg1wnDAY","albumname":"嘉宾","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":333,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":0},"rate":23,"singer":[{"id":11455,"mid":"004PjYVG2cjyBK","name":"张远"}],"size128":5339198,"size320":13347714,"size5_1":0,"sizeape":0,"sizeflac":33321727,"sizeogg":7191630,"songid":281506863,"songmid":"001i36ji0C8Cov","songname":"嘉宾","songorig":"嘉宾","songtype":0,"strMediaMid":"004aWakx2IXSD7","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"44","old_count":"36"},{"Franking_value":"19","cur_count":"39","data":{"albumdesc":"","albumid":989994,"albummid":"003y8dsH2wBHlo","albumname":"绅士","alertid":11,"belongCD":2,"cdIdx":0,"icons":135752,"interval":261,"isonly":0,"label":"0","msgid":0,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":0,"payinfo":0,"payplay":0,"paytrackmouth":0,"paytrackprice":0,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":0},"rate":23,"singer":[{"id":5062,"mid":"002J4UUk29y8BY","name":"薛之谦"}],"size128":4181035,"size320":10452304,"size5_1":0,"sizeape":0,"sizeflac":25308278,"sizeogg":5627447,"songid":102636799,"songmid":"001Qu4I30eVFYb","songname":"演员","songorig":"演员","songtype":0,"strMediaMid":"0007zzCV3py0DI","stream":1,"switch":81683,"type":0,"vid":"o0016t2ucce"},"in_count":"98","old_count":"39"},{"Franking_value":"13","cur_count":"40","data":{"albumdesc":"","albumid":3883404,"albummid":"003bSL0v4bpKAx","albumname":"等你下课","alertid":41,"belongCD":1,"cdIdx":0,"icons":12861438,"interval":270,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":960887},"rate":23,"singer":[{"id":4558,"mid":"0025NhlN2yWrP4","name":"周杰伦"}],"size128":4321080,"size320":10801666,"size5_1":0,"sizeape":0,"sizeflac":31916725,"sizeogg":6049286,"songid":212877900,"songmid":"001J5QJL1pRQYB","songname":"等你下课(with 杨瑞代)","songorig":"等你下课(with 杨瑞代)","songtype":0,"strMediaMid":"001t9B3h1FbMS8","stream":1,"switch":16897281,"type":0,"vid":"d002559kt56"},"in_count":"106","old_count":"41"},{"Franking_value":"9","cur_count":"41","data":{"albumdesc":"《夏至未至》电视剧插曲","albumid":2111861,"albummid":"001qHmKU29WX7K","albumname":"夏至未至 电视剧原声带","alertid":21,"belongCD":3,"cdIdx":0,"icons":8404860,"interval":235,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":0,"timefree":0},"preview":{"trybegin":61094,"tryend":89847,"trysize":0},"rate":23,"singer":[{"id":33680,"mid":"0037dNIC0n5pW8","name":"岑宁儿"}],"size128":3774381,"size320":9435638,"size5_1":0,"sizeape":0,"sizeflac":21768417,"sizeogg":5104913,"songid":202773258,"songmid":"0006V3BG48q1uP","songname":"追光者","songorig":"追光者","songtype":0,"strMediaMid":"002iJZZB0l01QY","stream":1,"switch":112387,"type":0,"vid":"z0024oj9ipu"},"in_count":"63","old_count":"42"},{"Franking_value":"14","cur_count":"42","data":{"albumdesc":"","albumid":8217,"albummid":"000I5jJB3blWeN","albumname":"范特西","alertid":41,"belongCD":10,"cdIdx":0,"icons":12861438,"interval":334,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":81197,"tryend":135772,"trysize":960887},"rate":23,"singer":[{"id":4558,"mid":"0025NhlN2yWrP4","name":"周杰伦"}],"size128":5348815,"size320":13371751,"size5_1":0,"sizeape":0,"sizeflac":33299251,"sizeogg":6738928,"songid":97743,"songmid":"000amRvH3wxv56","songname":"安静","songorig":"安静","songtype":0,"strMediaMid":"003QLRda0tLCuz","stream":1,"switch":16897281,"type":0,"vid":"m0013k05dly"},"in_count":"109","old_count":"44"},{"Franking_value":"14","cur_count":"43","data":{"albumdesc":"《萌三国》网游主题曲|《微微一笑很倾城》电视剧插曲","albumid":121274,"albummid":"001HUiKw0QsiUb","albumname":"万有引力","alertid":21,"belongCD":2,"cdIdx":0,"icons":12992510,"interval":235,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":54318,"tryend":91289,"trysize":960887},"rate":23,"singer":[{"id":3954,"mid":"001z2JmX09LLgL","name":"汪苏泷"},{"id":13578,"mid":"000Z1Ow71FFutX","name":"BY2"}],"size128":3764336,"size320":9410547,"size5_1":0,"sizeape":0,"sizeflac":26643618,"sizeogg":5444763,"songid":4830766,"songmid":"001bdYk41BCfRi","songname":"有点甜","songorig":"有点甜","songtype":0,"strMediaMid":"001sHB363mmpAv","stream":1,"switch":16897281,"type":0,"vid":"r0012ks5hgh"},"in_count":"92","old_count":"43"},{"Franking_value":"15","cur_count":"44","data":{"albumdesc":"","albumid":22195061,"albummid":"000FFtYv2kIpa1","albumname":"风吹过八千里","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":228,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":77144,"tryend":107757,"trysize":0},"rate":23,"singer":[{"id":7588624,"mid":"002lKaDq2lLLtk","name":"苏星婕"}],"size128":3660900,"size320":9151880,"size5_1":0,"sizeape":0,"sizeflac":22276043,"sizeogg":4865051,"songid":325136985,"songmid":"001hDICw1itMfY","songname":"风吹过八千里","songorig":"风吹过八千里","songtype":0,"strMediaMid":"0000D0pX3JjSq1","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"17","old_count":"40"},{"Franking_value":"0","cur_count":"45","data":{"albumdesc":"《微微一笑很倾城》电视剧片头曲","albumid":1578539,"albummid":"003RxTdZ0sJLwo","albumname":"微微一笑很倾城 电视剧原声带","alertid":21,"belongCD":1,"cdIdx":0,"icons":12992510,"interval":231,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":81265,"tryend":112983,"trysize":960887},"rate":23,"singer":[{"id":3954,"mid":"001z2JmX09LLgL","name":"汪苏泷"}],"size128":3711695,"size320":9278268,"size5_1":0,"sizeape":0,"sizeflac":28133874,"sizeogg":5592975,"songid":108172834,"songmid":"002xMLIa1JcZk0","songname":"一笑倾城","songorig":"一笑倾城","songtype":0,"strMediaMid":"0047GSk72cRACm","stream":1,"switch":16897281,"type":0,"vid":""},"in_count":"1","old_count":"0"},{"Franking_value":"14","cur_count":"46","data":{"albumdesc":"","albumid":36062,"albummid":"002Neh8l0uciQZ","albumname":"魔杰座","alertid":41,"belongCD":6,"cdIdx":0,"icons":12861438,"interval":256,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":72998,"tryend":104744,"trysize":960887},"rate":23,"singer":[{"id":4558,"mid":"0025NhlN2yWrP4","name":"周杰伦"}],"size128":4108738,"size320":10271547,"size5_1":0,"sizeape":0,"sizeflac":27086130,"sizeogg":5383093,"songid":449200,"songmid":"0042QMDR1VzSsx","songname":"说好的幸福呢","songorig":"说好的幸福呢","songtype":0,"strMediaMid":"001a8tgu4DggDy","stream":1,"switch":16897281,"type":0,"vid":"r0012mpm057"},"in_count":"31","old_count":"46"},{"Franking_value":"8","cur_count":"47","data":{"albumdesc":"","albumid":7326274,"albummid":"004exjMO1lm27e","albumname":"山楂树の恋","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":197,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":135387,"tryend":184240,"trysize":960887},"rate":23,"singer":[{"id":3417721,"mid":"003gFfHo4H6AHY","name":"程jiajia"}],"size128":3166250,"size320":7915312,"size5_1":0,"sizeape":0,"sizeflac":23822498,"sizeogg":4602611,"songid":235839585,"songmid":"0021uyhB2um654","songname":"山楂树の恋","songorig":"山楂树の恋","songtype":0,"strMediaMid":"004Qr5Cf0VRna8","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"51","old_count":"45"},{"Franking_value":"27","cur_count":"48","data":{"albumdesc":"《周末父母》电视剧片头曲","albumid":14922,"albummid":"004R8LFN08EGAD","albumname":"亲亲","alertid":41,"belongCD":2,"cdIdx":0,"icons":12992510,"interval":243,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":69327,"tryend":90797,"trysize":960887},"rate":23,"singer":[{"id":44,"mid":"000GGDys0yA0Nk","name":"梁静茹"}],"size128":3891808,"size320":9729235,"size5_1":0,"sizeape":0,"sizeflac":29333109,"sizeogg":5726255,"songid":169763,"songmid":"003Sn9Rg4N3oNq","songname":"暖暖","songorig":"暖暖","songtype":0,"strMediaMid":"001JRpBy0RAUnF","stream":1,"switch":16897281,"type":0,"vid":"g0010ntxzF8"},"in_count":"79","old_count":"48"},{"Franking_value":"8","cur_count":"49","data":{"albumdesc":"《明天你是否依然爱我》电影推广曲","albumid":16400896,"albummid":"002IsZpq264kAd","albumname":"永不失联的爱 (正式版)","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":272,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":0},"rate":23,"singer":[{"id":2174230,"mid":"002ug9Ha2zYM1y","name":"单依纯"}],"size128":4362028,"size320":10904761,"size5_1":0,"sizeape":0,"sizeflac":20504952,"sizeogg":5523540,"songid":290885851,"songmid":"003FoZ980Uyj9i","songname":"永不失联的爱","songorig":"永不失联的爱","songtype":0,"strMediaMid":"003FoZ980Uyj9i","stream":1,"switch":16889603,"type":0,"vid":"n0035eivjlq"},"in_count":"22","old_count":"51"},{"Franking_value":"14","cur_count":"50","data":{"albumdesc":"","albumid":5144678,"albummid":"000DKJ593fdu5v","albumname":"即兴","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":212,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":83218,"tryend":205354,"trysize":960887},"rate":23,"singer":[{"id":2710963,"mid":"0043iDLs1uuAWx","name":"小咪"}],"size128":3403629,"size320":8508792,"size5_1":0,"sizeape":0,"sizeflac":22061947,"sizeogg":4855978,"songid":221135100,"songmid":"001Ld6UI1JV7cj","songname":"即兴","songorig":"即兴","songtype":0,"strMediaMid":"001Ld6UI1JV7cj","stream":1,"switch":16889603,"type":0,"vid":""},"in_count":"93","old_count":"47"},{"Franking_value":"21","cur_count":"51","data":{"albumdesc":"《我是江小白》动画片尾曲","albumid":2316304,"albummid":"004NFJ230yX0Nz","albumname":"云烟成雨","alertid":21,"belongCD":0,"cdIdx":0,"icons":8535932,"interval":240,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":73010,"tryend":99603,"trysize":0},"rate":23,"singer":[{"id":951320,"mid":"000PeZCQ1i4XVs","name":"房东的猫"}],"size128":3853783,"size320":9634159,"size5_1":0,"sizeape":0,"sizeflac":24324552,"sizeogg":5385766,"songid":204586755,"songmid":"001yYM0I30CzdP","songname":"云烟成雨","songorig":"云烟成雨","songtype":0,"strMediaMid":"000iZ0Q94UxGO0","stream":1,"switch":16889603,"type":0,"vid":"i0026atsb7e"},"in_count":"101","old_count":"50"},{"Franking_value":"38","cur_count":"52","data":{"albumdesc":"","albumid":8220,"albummid":"000MkMni19ClKG","albumname":"叶惠美","alertid":41,"belongCD":3,"cdIdx":0,"icons":12861438,"interval":269,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":84339,"tryend":142856,"trysize":960887},"rate":23,"singer":[{"id":4558,"mid":"0025NhlN2yWrP4","name":"周杰伦"}],"size128":4317292,"size320":10792516,"size5_1":0,"sizeape":0,"sizeflac":31430142,"sizeogg":5864688,"songid":97773,"songmid":"0039MnYb0qxYhV","songname":"晴天","songorig":"晴天","songtype":0,"strMediaMid":"002202B43Cq4V4","stream":1,"switch":16897281,"type":0,"vid":"w0026q7f01a"},"in_count":"25","old_count":"0"},{"Franking_value":"52","cur_count":"53","data":{"albumdesc":"《花千骨》电视剧插曲","albumid":992081,"albummid":"0044dYsD2Y0lfN","albumname":"花千骨 电视剧原声带","alertid":22,"belongCD":4,"cdIdx":0,"icons":12992510,"interval":274,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":70264,"tryend":97403,"trysize":960887},"rate":23,"singer":[{"id":199515,"mid":"0003ZpE43ypssl","name":"张碧晨"}],"size128":4393375,"size320":10983128,"size5_1":0,"sizeape":0,"sizeflac":30106645,"sizeogg":6169684,"songid":102677326,"songmid":"001q62Bb1xCTx7","songname":"年轮","songorig":"年轮","songtype":0,"strMediaMid":"003yL5x529r4g7","stream":1,"switch":16897281,"type":0,"vid":""},"in_count":"3","old_count":"52"},{"Franking_value":"4","cur_count":"54","data":{"albumdesc":"《小妖的金色城堡》戏剧主题曲","albumid":3763317,"albummid":"003xoLyf0Xj3Oe","albumname":"如果雨之后","alertid":21,"belongCD":6,"cdIdx":0,"icons":8535932,"interval":258,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":0,"tryend":0,"trysize":960887},"rate":23,"singer":[{"id":200521,"mid":"0022bqqN3dRfN4","name":"Eric周兴哲"}],"size128":4144695,"size320":10361420,"size5_1":0,"sizeape":0,"sizeflac":28707824,"sizeogg":5643828,"songid":202550561,"songmid":"004c4CEB3jfz7a","songname":"永不失联的爱","songorig":"永不失联的爱","songtype":0,"strMediaMid":"001osHOr2XkUV8","stream":1,"switch":16889603,"type":0,"vid":"k0023njvfe4"},"in_count":"56","old_count":"53"},{"Franking_value":"19","cur_count":"55","data":{"albumdesc":"《头文字D》电影插曲","albumid":14311,"albummid":"002MAeob3zLXwZ","albumname":"J III MP3 Player","alertid":41,"belongCD":2,"cdIdx":0,"icons":12861438,"interval":295,"isonly":0,"label":"0","msgid":13,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":1,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":91454,"tryend":119760,"trysize":960887},"rate":23,"singer":[{"id":4558,"mid":"0025NhlN2yWrP4","name":"周杰伦"}],"size128":4732355,"size320":11830556,"size5_1":0,"sizeape":0,"sizeflac":35323866,"sizeogg":6667274,"songid":5105986,"songmid":"001xd0HI0X9GNq","songname":"一路向北","songorig":"一路向北","songtype":0,"strMediaMid":"004cZvLj1qDq4A","stream":1,"switch":16897281,"type":0,"vid":"m00135c6uxe"},"in_count":"74","old_count":"0"}]
     * topinfo : {"ListName":"巅峰榜·K歌金曲","MacDetailPicUrl":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34147.png","MacListPicUrl":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34147.png","UpdateType":"0","albuminfo":"","headPic_v12":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34144.png","info":"集结当下全民K歌热门的点唱歌曲，展现K歌用户的点唱趋势。<br>更新时间：每周四<br>歌曲数量：50首 <br>统计算法：根据用户在全民K歌的点唱行为进行排序","listennum":1495491,"pic":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34147.png","picDetail":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34144.png","pic_album":"http://imgcache.qq.com/music/photo_new/T002R300x300M000001uaPM93kxk1R.jpg","pic_h5":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34144.png","pic_v11":"http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34147.png","pic_v12":"http://y.gtimg.cn/music/photo_new/T003R300x300M000000HBm1y30mcgd.jpg","topID":"36","type":"0"}
     * total_song_num : 55
     * update_time : 2022-03-03
     */

    private int code;
    private int color;
    private int comment_num;
    private int cur_song_num;
    private String date;
    private String day_of_year;
    private int song_begin;
    private TopinfoBean topinfo;
    private int total_song_num;
    private String update_time;
    private List<SonglistBean> songlist;

    public static class TopinfoBean implements Serializable {
        public String getListName() {
            return ListName;
        }

        public String getMacDetailPicUrl() {
            return MacDetailPicUrl;
        }

        public String getMacListPicUrl() {
            return MacListPicUrl;
        }

        public String getUpdateType() {
            return UpdateType;
        }

        public String getAlbuminfo() {
            return albuminfo;
        }

        public String getHeadPic_v12() {
            return headPic_v12;
        }

        public String getInfo() {
            return info;
        }

        public int getListennum() {
            return listennum;
        }

        public String getPic() {
            return pic;
        }

        public String getPicDetail() {
            return picDetail;
        }

        public String getPic_album() {
            return pic_album;
        }

        public String getPic_h5() {
            return pic_h5;
        }

        public String getPic_v11() {
            return pic_v11;
        }

        public String getPic_v12() {
            return pic_v12;
        }

        public String getTopID() {
            return topID;
        }

        public String getType() {
            return type;
        }

        /**
         * ListName : 巅峰榜·K歌金曲
         * MacDetailPicUrl : http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34147.png
         * MacListPicUrl : http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34147.png
         * UpdateType : 0
         * albuminfo :
         * headPic_v12 : http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34144.png
         * info : 集结当下全民K歌热门的点唱歌曲，展现K歌用户的点唱趋势。<br>更新时间：每周四<br>歌曲数量：50首 <br>统计算法：根据用户在全民K歌的点唱行为进行排序
         * listennum : 1495491
         * pic : http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34147.png
         * picDetail : http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34144.png
         * pic_album : http://imgcache.qq.com/music/photo_new/T002R300x300M000001uaPM93kxk1R.jpg
         * pic_h5 : http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34144.png
         * pic_v11 : http://y.gtimg.cn/music/common/upload/t_order_channel_hitlist_conf/34147.png
         * pic_v12 : http://y.gtimg.cn/music/photo_new/T003R300x300M000000HBm1y30mcgd.jpg
         * topID : 36
         * type : 0
         */

        private String ListName;
        private String MacDetailPicUrl;
        private String MacListPicUrl;
        private String UpdateType;
        private String albuminfo;
        private String headPic_v12;
        private String info;
        private int listennum;
        private String pic;
        private String picDetail;
        private String pic_album;
        private String pic_h5;
        private String pic_v11;
        private String pic_v12;
        private String topID;
        private String type;

        @Override
        public String toString() {
            return "TopinfoBean{" +
                    "ListName='" + ListName + '\'' +
                    ", MacDetailPicUrl='" + MacDetailPicUrl + '\'' +
                    ", MacListPicUrl='" + MacListPicUrl + '\'' +
                    ", UpdateType='" + UpdateType + '\'' +
                    ", albuminfo='" + albuminfo + '\'' +
                    ", headPic_v12='" + headPic_v12 + '\'' +
                    ", info='" + info + '\'' +
                    ", listennum=" + listennum +
                    ", pic='" + pic + '\'' +
                    ", picDetail='" + picDetail + '\'' +
                    ", pic_album='" + pic_album + '\'' +
                    ", pic_h5='" + pic_h5 + '\'' +
                    ", pic_v11='" + pic_v11 + '\'' +
                    ", pic_v12='" + pic_v12 + '\'' +
                    ", topID='" + topID + '\'' +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    public int getCode() {
        return code;
    }

    public int getColor() {
        return color;
    }

    public int getComment_num() {
        return comment_num;
    }

    public int getCur_song_num() {
        return cur_song_num;
    }

    public String getDate() {
        return date;
    }

    public String getDay_of_year() {
        return day_of_year;
    }

    public int getSong_begin() {
        return song_begin;
    }

    public TopinfoBean getTopinfo() {
        return topinfo;
    }

    public int getTotal_song_num() {
        return total_song_num;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public List<SonglistBean> getSonglist() {
        return songlist;
    }

    public static class SonglistBean implements Serializable {
        /**
         * Franking_value : 1
         * cur_count : 1
         * data : {"albumdesc":"《英雄联盟：双城之战》动画剧集中文主题曲","albumid":23277502,"albummid":"001uaPM93kxk1R","albumname":"孤勇者","alertid":21,"belongCD":1,"cdIdx":0,"icons":8535932,"interval":256,"isonly":0,"label":"0","msgid":14,"pay":{"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0},"preview":{"trybegin":80768,"tryend":116032,"trysize":960887},"rate":23,"singer":[{"id":143,"mid":"003Nz2So3XXYek","name":"陈奕迅"}],"size128":4097029,"size320":10242283,"size5_1":0,"sizeape":0,"sizeflac":28729027,"sizeogg":5558885,"songid":331839675,"songmid":"003UkWuI0E8U0l","songname":"孤勇者","songorig":"孤勇者","songtype":0,"strMediaMid":"003UkWuI0E8U0l","stream":1,"switch":16888579,"type":0,"vid":"y0041ywgpm7"}
         * in_count : 14
         * old_count : 1
         */

        private String Franking_value;
        private String cur_count;
        private DataBean data;
        private String in_count;
        private String old_count;

        public String getFranking_value() {
            return Franking_value;
        }

        public String getCur_count() {
            return cur_count;
        }

        public DataBean getData() {
            return data;
        }

        public String getIn_count() {
            return in_count;
        }

        public String getOld_count() {
            return old_count;
        }

        @Override
        public String toString() {
            return "SonglistBean{" +
                    "Franking_value='" + Franking_value + '\'' +
                    ", cur_count='" + cur_count + '\'' +
                    ", data=" + data +
                    ", in_count='" + in_count + '\'' +
                    ", old_count='" + old_count + '\'' +
                    '}';
        }

        public static class DataBean implements Serializable {
            /**
             * albumdesc : 《英雄联盟：双城之战》动画剧集中文主题曲
             * albumid : 23277502
             * albummid : 001uaPM93kxk1R
             * albumname : 孤勇者
             * alertid : 21
             * belongCD : 1
             * cdIdx : 0
             * icons : 8535932
             * interval : 256
             * isonly : 0
             * label : 0
             * msgid : 14
             * pay : {"payalbum":0,"payalbumprice":0,"paydownload":1,"payinfo":1,"payplay":0,"paytrackmouth":1,"paytrackprice":200,"timefree":0}
             * preview : {"trybegin":80768,"tryend":116032,"trysize":960887}
             * rate : 23
             * singer : [{"id":143,"mid":"003Nz2So3XXYek","name":"陈奕迅"}]
             * size128 : 4097029
             * size320 : 10242283
             * size5_1 : 0
             * sizeape : 0
             * sizeflac : 28729027
             * sizeogg : 5558885
             * songid : 331839675
             * songmid : 003UkWuI0E8U0l
             * songname : 孤勇者
             * songorig : 孤勇者
             * songtype : 0
             * strMediaMid : 003UkWuI0E8U0l
             * stream : 1
             * switch : 16888579
             * type : 0
             * vid : y0041ywgpm7
             */

            private String albumdesc;
            private int albumid;
            private String albummid;
            private String albumname;
            private int alertid;
            private int belongCD;
            private int cdIdx;
            private int icons;
            private int interval;
            private int isonly;
            private String label;
            private int msgid;
            private PayBean pay;
            private PreviewBean preview;
            private int rate;
            private int size128;
            private int size320;
            private int size5_1;
            private int sizeape;
            private int sizeflac;
            private int sizeogg;
            private int songid;
            private String songmid;
            private String songname;
            private String songorig;
            private int songtype;
            private String strMediaMid;
            private int stream;
            @SerializedName("switch")
            private int switchX;
            private int type;
            private String vid;
            private List<SingerBean> singer;

            public String getAlbumdesc() {
                return albumdesc;
            }

            public int getAlbumid() {
                return albumid;
            }

            public String getAlbummid() {
                return albummid;
            }

            public String getAlbumname() {
                return albumname;
            }

            public int getAlertid() {
                return alertid;
            }

            public int getBelongCD() {
                return belongCD;
            }

            public int getCdIdx() {
                return cdIdx;
            }

            public int getIcons() {
                return icons;
            }

            public int getInterval() {
                return interval;
            }

            public int getIsonly() {
                return isonly;
            }

            public String getLabel() {
                return label;
            }

            public int getMsgid() {
                return msgid;
            }

            public PayBean getPay() {
                return pay;
            }

            public PreviewBean getPreview() {
                return preview;
            }

            public int getRate() {
                return rate;
            }

            public int getSize128() {
                return size128;
            }

            public int getSize320() {
                return size320;
            }

            public int getSize5_1() {
                return size5_1;
            }

            public int getSizeape() {
                return sizeape;
            }

            public int getSizeflac() {
                return sizeflac;
            }

            public int getSizeogg() {
                return sizeogg;
            }

            public int getSongid() {
                return songid;
            }

            public String getSongmid() {
                return songmid;
            }

            public String getSongname() {
                return songname;
            }

            public String getSongorig() {
                return songorig;
            }

            public int getSongtype() {
                return songtype;
            }

            public String getStrMediaMid() {
                return strMediaMid;
            }

            public int getStream() {
                return stream;
            }

            public int getSwitchX() {
                return switchX;
            }

            public int getType() {
                return type;
            }

            public String getVid() {
                return vid;
            }

            public List<SingerBean> getSinger() {
                return singer;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "albumdesc='" + albumdesc + '\'' +
                        ", albumid=" + albumid +
                        ", albummid='" + albummid + '\'' +
                        ", albumname='" + albumname + '\'' +
                        ", alertid=" + alertid +
                        ", belongCD=" + belongCD +
                        ", cdIdx=" + cdIdx +
                        ", icons=" + icons +
                        ", interval=" + interval +
                        ", isonly=" + isonly +
                        ", label='" + label + '\'' +
                        ", msgid=" + msgid +
                        ", pay=" + pay +
                        ", preview=" + preview +
                        ", rate=" + rate +
                        ", size128=" + size128 +
                        ", size320=" + size320 +
                        ", size5_1=" + size5_1 +
                        ", sizeape=" + sizeape +
                        ", sizeflac=" + sizeflac +
                        ", sizeogg=" + sizeogg +
                        ", songid=" + songid +
                        ", songmid='" + songmid + '\'' +
                        ", songname='" + songname + '\'' +
                        ", songorig='" + songorig + '\'' +
                        ", songtype=" + songtype +
                        ", strMediaMid='" + strMediaMid + '\'' +
                        ", stream=" + stream +
                        ", switchX=" + switchX +
                        ", type=" + type +
                        ", vid='" + vid + '\'' +
                        ", singer=" + singer +
                        '}';
            }

            public static class PayBean implements Serializable {
                /**
                 * payalbum : 0
                 * payalbumprice : 0
                 * paydownload : 1
                 * payinfo : 1
                 * payplay : 0
                 * paytrackmouth : 1
                 * paytrackprice : 200
                 * timefree : 0
                 */

                private int payalbum;
                private int payalbumprice;
                private int paydownload;
                private int payinfo;
                private int payplay;
                private int paytrackmouth;
                private int paytrackprice;
                private int timefree;
            }

            public static class PreviewBean implements Serializable {
                /**
                 * trybegin : 80768
                 * tryend : 116032
                 * trysize : 960887
                 */

                private int trybegin;
                private int tryend;
                private int trysize;

                public int getTrybegin() {
                    return trybegin;
                }

                public int getTryend() {
                    return tryend;
                }

                public int getTrysize() {
                    return trysize;
                }

                @Override
                public String toString() {
                    return "PreviewBean{" +
                            "trybegin=" + trybegin +
                            ", tryend=" + tryend +
                            ", trysize=" + trysize +
                            '}';
                }
            }

            public static class SingerBean implements Serializable {
                /**
                 * id : 143
                 * mid : 003Nz2So3XXYek
                 * name : 陈奕迅
                 */

                private int id;
                private String mid;
                private String name;

                @Override
                public String toString() {
                    return "SingerBean{" +
                            "id=" + id +
                            ", mid='" + mid + '\'' +
                            ", name='" + name + '\'' +
                            '}';
                }

                public int getId() {
                    return id;
                }

                public String getMid() {
                    return mid;
                }

                public String getName() {
                    return name;
                }
            }
        }
    }
}
