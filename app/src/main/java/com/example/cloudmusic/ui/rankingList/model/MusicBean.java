package com.example.cloudmusic.ui.rankingList.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class MusicBean implements Serializable {
    /**
     * authors : [{"birthday":"1969-02-18","is_publish":1,"avatar":"http://singerimg.kugou.com/uploadpic/softhead/{size}/20220126/20220126155536919.jpg","author_id":2441,"language":"华语","identity":15,"country":"中国","author_name":"孙楠","type":1}]
     * extName : mp3
     * author_name : 孙楠
     * sqprivilege : 0
     * status : 1
     * audio_id : 249315
     * url : https://sharefs.ali.kugou.com/202203091638/5ad3c4baed6e45236d83903d52ed9e08/KGTX/CLTX001/32856ed5e34cfe975149ead254a38528.mp3
     * errcode : 0
     * choricSinger : 孙楠
     * fileHead : 100
     * fail_process : 0
     * timeLength : 237
     * bitRate : 128
     * mvhash :
     * fileName : 孙楠 - 留什么给你
     * intro :
     * 128privilege : 0
     * backup_url : ["https://sharefs.cloud.kugou.com/202203091638/a8cd394b02d87c5f3e6bfac8b18acb1f/KGTX/CLTX001/32856ed5e34cfe975149ead254a38528.mp3"]
     * req_hash : 32856ED5E34CFE975149EAD254A38528
     * singerName : 孙楠
     * q : 0
     * time : 1646815962
     * area_code : 1
     * singerHead :
     * extra : {"320hash":"D3A8C417F7DB45F82860723C9981B4C3","sqfilesize":29177645,"128filesize":3798617,"320filesize":9496236,"128hash":"32856ED5E34CFE975149EAD254A38528","sqhash":"A22FF18FB141CBF87D108B9DD463E8C9"}
     * publish_self_flag : 0
     * topic_remark :
     * albumid : 964178
     * album_img : http://imge.kugou.com/stdmusic/{size}/20150718/20150718150204815336.jpg
     * audio_group_id : 16434
     * pay_type : 0
     * store_type : audio
     * stype : 11323
     * trans_param : {"cpy_grade":5,"classmap":{"attr0":100667400},"cid":35018062,"cpy_level":1,"cpy_attr0":0,"hash_multitrack":"3534C028B3DB91F1819F2B1A53D57D45","pay_block_tpl":1,"musicpack_advance":0,"display":32,"display_rate":1}
     * topic_url :
     * fileSize : 3798617
     * album_audio_id : 32077008
     * error :
     * songName : 留什么给你
     * privilege : 0
     * imgUrl : http://singerimg.kugou.com/uploadpic/softhead/{size}/20220126/20220126155536919.jpg
     * ctype : 1009
     * 320privilege : 0
     * singerId : 2441
     * hash : 32856ED5E34CFE975149EAD254A38528
     */

    private String extName;
    private String author_name;
    private int sqprivilege;
    private int status;
    private int audio_id;
    private String url;
    private int errcode;
    private String choricSinger;
    private int fileHead;
    private int fail_process;
    private int timeLength;
    private int bitRate;
    private String mvhash;
    private String fileName;
    private String intro;
    @SerializedName("128privilege")
    private int _$128privilege;
    private String req_hash;
    private String singerName;
    private int q;
    private int time;
    private String area_code;
    private String singerHead;
    private ExtraBean extra;
    private int publish_self_flag;
    private String topic_remark;
    private int albumid;
    private String album_img;
    private int audio_group_id;
    private int pay_type;
    private String store_type;
    private int stype;
    private TransParamBean trans_param;
    private String topic_url;
    private int fileSize;
    private int album_audio_id;
    private String error;
    private String songName;
    private int privilege;
    private String imgUrl;
    private int ctype;
    @SerializedName("320privilege")
    private int _$320privilege;
    private int singerId;
    private String hash;
    private List<AuthorsBean> authors;
    private List<String> backup_url;

    public String getExtName() {
        return extName;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public int getSqprivilege() {
        return sqprivilege;
    }

    public int getStatus() {
        return status;
    }

    public int getAudio_id() {
        return audio_id;
    }

    public String getUrl() {
        return url;
    }

    public int getErrcode() {
        return errcode;
    }

    public String getChoricSinger() {
        return choricSinger;
    }

    public int getFileHead() {
        return fileHead;
    }

    public int getFail_process() {
        return fail_process;
    }

    public int getTimeLength() {
        return timeLength;
    }

    public int getBitRate() {
        return bitRate;
    }

    public String getMvhash() {
        return mvhash;
    }

    public String getFileName() {
        return fileName;
    }

    public String getIntro() {
        return intro;
    }

    public int get_$128privilege() {
        return _$128privilege;
    }

    public String getReq_hash() {
        return req_hash;
    }

    public String getSingerName() {
        return singerName;
    }

    public int getQ() {
        return q;
    }

    public int getTime() {
        return time;
    }

    public String getArea_code() {
        return area_code;
    }

    public String getSingerHead() {
        return singerHead;
    }

    public ExtraBean getExtra() {
        return extra;
    }

    public int getPublish_self_flag() {
        return publish_self_flag;
    }

    public String getTopic_remark() {
        return topic_remark;
    }

    public int getAlbumid() {
        return albumid;
    }

    public String getAlbum_img() {
        return album_img;
    }

    public int getAudio_group_id() {
        return audio_group_id;
    }

    public int getPay_type() {
        return pay_type;
    }

    public String getStore_type() {
        return store_type;
    }

    public int getStype() {
        return stype;
    }

    public TransParamBean getTrans_param() {
        return trans_param;
    }

    public String getTopic_url() {
        return topic_url;
    }

    public int getFileSize() {
        return fileSize;
    }

    public int getAlbum_audio_id() {
        return album_audio_id;
    }

    public String getError() {
        return error;
    }

    public String getSongName() {
        return songName;
    }

    public int getPrivilege() {
        return privilege;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public int getCtype() {
        return ctype;
    }

    public int get_$320privilege() {
        return _$320privilege;
    }

    public int getSingerId() {
        return singerId;
    }

    public String getHash() {
        return hash;
    }

    public List<AuthorsBean> getAuthors() {
        return authors;
    }

    public List<String> getBackup_url() {
        return backup_url;
    }

    @Override
    public String toString() {
        return "MusicBean{" +
                "extName='" + extName + '\'' +
                ", author_name='" + author_name + '\'' +
                ", sqprivilege=" + sqprivilege +
                ", status=" + status +
                ", audio_id=" + audio_id +
                ", url='" + url + '\'' +
                ", errcode=" + errcode +
                ", choricSinger='" + choricSinger + '\'' +
                ", fileHead=" + fileHead +
                ", fail_process=" + fail_process +
                ", timeLength=" + timeLength +
                ", bitRate=" + bitRate +
                ", mvhash='" + mvhash + '\'' +
                ", fileName='" + fileName + '\'' +
                ", intro='" + intro + '\'' +
                ", _$128privilege=" + _$128privilege +
                ", req_hash='" + req_hash + '\'' +
                ", singerName='" + singerName + '\'' +
                ", q=" + q +
                ", time=" + time +
                ", area_code='" + area_code + '\'' +
                ", singerHead='" + singerHead + '\'' +
                ", extra=" + extra +
                ", publish_self_flag=" + publish_self_flag +
                ", topic_remark='" + topic_remark + '\'' +
                ", albumid=" + albumid +
                ", album_img='" + album_img + '\'' +
                ", audio_group_id=" + audio_group_id +
                ", pay_type=" + pay_type +
                ", store_type='" + store_type + '\'' +
                ", stype=" + stype +
                ", trans_param=" + trans_param +
                ", topic_url='" + topic_url + '\'' +
                ", fileSize=" + fileSize +
                ", album_audio_id=" + album_audio_id +
                ", error='" + error + '\'' +
                ", songName='" + songName + '\'' +
                ", privilege=" + privilege +
                ", imgUrl='" + imgUrl + '\'' +
                ", ctype=" + ctype +
                ", _$320privilege=" + _$320privilege +
                ", singerId=" + singerId +
                ", hash='" + hash + '\'' +
                ", authors=" + authors +
                ", backup_url=" + backup_url +
                '}';
    }

    public static class ExtraBean implements Serializable {
        /**
         * 320hash : D3A8C417F7DB45F82860723C9981B4C3
         * sqfilesize : 29177645
         * 128filesize : 3798617
         * 320filesize : 9496236
         * 128hash : 32856ED5E34CFE975149EAD254A38528
         * sqhash : A22FF18FB141CBF87D108B9DD463E8C9
         */

        @SerializedName("320hash")
        private String _$320hash;
        private int sqfilesize;
        @SerializedName("128filesize")
        private int _$128filesize;
        @SerializedName("320filesize")
        private int _$320filesize;
        @SerializedName("128hash")
        private String _$128hash;
        private String sqhash;
    }

    public static class TransParamBean implements Serializable {
        /**
         * cpy_grade : 5
         * classmap : {"attr0":100667400}
         * cid : 35018062
         * cpy_level : 1
         * cpy_attr0 : 0
         * hash_multitrack : 3534C028B3DB91F1819F2B1A53D57D45
         * pay_block_tpl : 1
         * musicpack_advance : 0
         * display : 32
         * display_rate : 1
         */

        private int cpy_grade;
        private ClassmapBean classmap;
        private int cid;
        private int cpy_level;
        private int cpy_attr0;
        private String hash_multitrack;
        private int pay_block_tpl;
        private int musicpack_advance;
        private int display;
        private int display_rate;

        public static class ClassmapBean implements Serializable {
            /**
             * attr0 : 100667400
             */

            private int attr0;
        }
    }

    public static class AuthorsBean implements Serializable {
        public String getBirthday() {
            return birthday;
        }

        public int getIs_publish() {
            return is_publish;
        }

        public String getAvatar() {
            return avatar;
        }

        @Override
        public String toString() {
            return "AuthorsBean{" +
                    "birthday='" + birthday + '\'' +
                    ", is_publish=" + is_publish +
                    ", avatar='" + avatar + '\'' +
                    ", author_id=" + author_id +
                    ", language='" + language + '\'' +
                    ", identity=" + identity +
                    ", country='" + country + '\'' +
                    ", author_name='" + author_name + '\'' +
                    ", type=" + type +
                    '}';
        }

        public int getAuthor_id() {
            return author_id;
        }

        public String getLanguage() {
            return language;
        }

        public int getIdentity() {
            return identity;
        }

        public String getCountry() {
            return country;
        }

        public String getAuthor_name() {
            return author_name;
        }

        public int getType() {
            return type;
        }

        /**
         * birthday : 1969-02-18
         * is_publish : 1
         * avatar : http://singerimg.kugou.com/uploadpic/softhead/{size}/20220126/20220126155536919.jpg
         * author_id : 2441
         * language : 华语
         * identity : 15
         * country : 中国
         * author_name : 孙楠
         * type : 1
         */

        private String birthday;
        private int is_publish;
        private String avatar;
        private int author_id;
        private String language;
        private int identity;
        private String country;
        private String author_name;
        private int type;
    }
}
