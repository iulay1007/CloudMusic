package com.example.cloudmusic.ui.homepage.model;

import java.io.Serializable;
import java.util.List;

public class KeyBean implements Serializable {
    /**
     * code : 0
     * ts : 1646313039780
     * start_ts : 1646313039751
     * traceid : 05991979202eaa8d
     * req : {"code":0,"data":{"expiration":86400,"freeflowsip":["http://58.144.248.168/amobile.music.tc.qq.com/","http://58.144.248.169/amobile.music.tc.qq.com/","http://58.144.248.170/amobile.music.tc.qq.com/"],"keepalivefile":"C400004TsFuW2mZbRR.m4a?guid=8348972662&vkey=16212B1C01A7E56ABA0F2F4930F9FB506922DBC33CCE09E50853A05673E66B4C9B309613AC2B16D7351C9004739BEBA7D6C67D8A0798CB11&uin=0&fromtag=3","msg":"ok","retcode":0,"servercheck":"eb69f3e351bd6fa0d4d6eb95c5a12620","sip":["http://58.144.248.168/amobile.music.tc.qq.com/","http://ws.stream.qqmusic.qq.com/","http://isure.stream.qqmusic.qq.com/","http://58.144.248.169/amobile.music.tc.qq.com/","http://58.144.248.170/amobile.music.tc.qq.com/"],"testfile2g":"C400003mAan70zUy5O.m4a?guid=8348972662&vkey=1B31C027166959ACF3C8525C13921A66D26AA46159288408ECA53D117212F7096532795580FD0B44DB375DEA5ED3DF3E65DB73E3589DA060&uin=0&fromtag=3","testfilewifi":"C400003mAan70zUy5O.m4a?guid=8348972662&vkey=1B31C027166959ACF3C8525C13921A66D26AA46159288408ECA53D117212F7096532795580FD0B44DB375DEA5ED3DF3E65DB73E3589DA060&uin=0&fromtag=3","uin":"","userip":"58.19.3.2","vkey":"01111CC610D452E4B17F01C29CDD6651A3A2B25FE049B7542665601FD215804D12167E618E45B2C27913E3ACCFA71294233101C567E4EC26"}}
     * req_0 : {"code":0,"data":{"uin":"","retcode":0,"verify_type":0,"login_key":"","msg":"58.19.3.2","sip":["http://ws.stream.qqmusic.qq.com/","http://isure.stream.qqmusic.qq.com/"],"thirdip":["",""],"testfile2g":"C400003mAan70zUy5O.m4a?guid=8348972662&vkey=D3C7DB9AB6C52F08C2FDD9D715D3426BA871F04ECAFAA5DEE0A227C8DC206555449DAE509EB22176E7113741614F33E5015DA350FED41E12&uin=&fromtag=3","testfilewifi":"C400003mAan70zUy5O.m4a?guid=8348972662&vkey=D3C7DB9AB6C52F08C2FDD9D715D3426BA871F04ECAFAA5DEE0A227C8DC206555449DAE509EB22176E7113741614F33E5015DA350FED41E12&uin=&fromtag=3","midurlinfo":[{"songmid":"002wit7s1Tvdlg","filename":"C400000RMeN92LDUm0.m4a","purl":"C400000RMeN92LDUm0.m4a?guid=8348972662&vkey=E7B88F3490FBA862BC3848F786322C333511B8EC6ED2D34BF076334427E29BD30AB49965B44DAE9BD3D9145ADE8445C6E74A769C33191984&uin=&fromtag=66","errtype":"","p2pfromtag":0,"qmdlfromtag":0,"common_downfromtag":0,"vip_downfromtag":0,"pdl":0,"premain":0,"hisdown":0,"hisbuy":0,"uiAlert":0,"isbuy":0,"pneedbuy":0,"pneed":0,"isonly":0,"onecan":0,"result":0,"tips":"","opi48kurl":"","opi96kurl":"","opi192kurl":"","opiflackurl":"","opi128kurl":"","opi192koggurl":"","wififromtag":"","flowfromtag":"","wifiurl":"","flowurl":"","vkey":"E7B88F3490FBA862BC3848F786322C333511B8EC6ED2D34BF076334427E29BD30AB49965B44DAE9BD3D9145ADE8445C6E74A769C33191984","opi30surl":"","ekey":"","auth_switch":16889603,"subcode":0,"opi96koggurl":"","auth_switch2":0}],"servercheck":"eb69f3e351bd6fa0d4d6eb95c5a12620","expiration":80400}}
     */

    private int code;
    private long ts;
    private long start_ts;
    private String traceid;
    private ReqBean req;
    private Req0Bean req_0;

    public int getCode() {
        return code;
    }

    public long getTs() {
        return ts;
    }

    public long getStart_ts() {
        return start_ts;
    }

    public String getTraceid() {
        return traceid;
    }

    public ReqBean getReq() {
        return req;
    }

    public Req0Bean getReq_0() {
        return req_0;
    }

    @Override
    public String toString() {
        return "KeyBean{" +
                "code=" + code +
                ", ts=" + ts +
                ", start_ts=" + start_ts +
                ", traceid='" + traceid + '\'' +
                ", req=" + req +
                ", req_0=" + req_0 +
                '}';
    }

    public static class ReqBean implements Serializable {
        /**
         * code : 0
         * data : {"expiration":86400,"freeflowsip":["http://58.144.248.168/amobile.music.tc.qq.com/","http://58.144.248.169/amobile.music.tc.qq.com/","http://58.144.248.170/amobile.music.tc.qq.com/"],"keepalivefile":"C400004TsFuW2mZbRR.m4a?guid=8348972662&vkey=16212B1C01A7E56ABA0F2F4930F9FB506922DBC33CCE09E50853A05673E66B4C9B309613AC2B16D7351C9004739BEBA7D6C67D8A0798CB11&uin=0&fromtag=3","msg":"ok","retcode":0,"servercheck":"eb69f3e351bd6fa0d4d6eb95c5a12620","sip":["http://58.144.248.168/amobile.music.tc.qq.com/","http://ws.stream.qqmusic.qq.com/","http://isure.stream.qqmusic.qq.com/","http://58.144.248.169/amobile.music.tc.qq.com/","http://58.144.248.170/amobile.music.tc.qq.com/"],"testfile2g":"C400003mAan70zUy5O.m4a?guid=8348972662&vkey=1B31C027166959ACF3C8525C13921A66D26AA46159288408ECA53D117212F7096532795580FD0B44DB375DEA5ED3DF3E65DB73E3589DA060&uin=0&fromtag=3","testfilewifi":"C400003mAan70zUy5O.m4a?guid=8348972662&vkey=1B31C027166959ACF3C8525C13921A66D26AA46159288408ECA53D117212F7096532795580FD0B44DB375DEA5ED3DF3E65DB73E3589DA060&uin=0&fromtag=3","uin":"","userip":"58.19.3.2","vkey":"01111CC610D452E4B17F01C29CDD6651A3A2B25FE049B7542665601FD215804D12167E618E45B2C27913E3ACCFA71294233101C567E4EC26"}
         */

        private int code;
        private DataBean data;

        public int getCode() {
            return code;
        }

        public DataBean getData() {
            return data;
        }

        @Override
        public String toString() {
            return "ReqBean{" +
                    "code=" + code +
                    ", data=" + data +
                    '}';
        }

        public static class DataBean implements Serializable {
            /**
             * expiration : 86400
             * freeflowsip : ["http://58.144.248.168/amobile.music.tc.qq.com/","http://58.144.248.169/amobile.music.tc.qq.com/","http://58.144.248.170/amobile.music.tc.qq.com/"]
             * keepalivefile : C400004TsFuW2mZbRR.m4a?guid=8348972662&vkey=16212B1C01A7E56ABA0F2F4930F9FB506922DBC33CCE09E50853A05673E66B4C9B309613AC2B16D7351C9004739BEBA7D6C67D8A0798CB11&uin=0&fromtag=3
             * msg : ok
             * retcode : 0
             * servercheck : eb69f3e351bd6fa0d4d6eb95c5a12620
             * sip : ["http://58.144.248.168/amobile.music.tc.qq.com/","http://ws.stream.qqmusic.qq.com/","http://isure.stream.qqmusic.qq.com/","http://58.144.248.169/amobile.music.tc.qq.com/","http://58.144.248.170/amobile.music.tc.qq.com/"]
             * testfile2g : C400003mAan70zUy5O.m4a?guid=8348972662&vkey=1B31C027166959ACF3C8525C13921A66D26AA46159288408ECA53D117212F7096532795580FD0B44DB375DEA5ED3DF3E65DB73E3589DA060&uin=0&fromtag=3
             * testfilewifi : C400003mAan70zUy5O.m4a?guid=8348972662&vkey=1B31C027166959ACF3C8525C13921A66D26AA46159288408ECA53D117212F7096532795580FD0B44DB375DEA5ED3DF3E65DB73E3589DA060&uin=0&fromtag=3
             * uin :
             * userip : 58.19.3.2
             * vkey : 01111CC610D452E4B17F01C29CDD6651A3A2B25FE049B7542665601FD215804D12167E618E45B2C27913E3ACCFA71294233101C567E4EC26
             */

            private int expiration;
            private String keepalivefile;
            private String msg;
            private int retcode;
            private String servercheck;
            private String testfile2g;
            private String testfilewifi;
            private String uin;
            private String userip;
            private String vkey;
            private List<String> freeflowsip;
            private List<String> sip;

            public int getExpiration() {
                return expiration;
            }

            public String getKeepalivefile() {
                return keepalivefile;
            }

            public String getMsg() {
                return msg;
            }

            public int getRetcode() {
                return retcode;
            }

            public String getServercheck() {
                return servercheck;
            }

            public String getTestfile2g() {
                return testfile2g;
            }

            public String getTestfilewifi() {
                return testfilewifi;
            }

            public String getUin() {
                return uin;
            }

            public String getUserip() {
                return userip;
            }

            public String getVkey() {
                return vkey;
            }

            public List<String> getFreeflowsip() {
                return freeflowsip;
            }

            public List<String> getSip() {
                return sip;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "expiration=" + expiration +
                        ", keepalivefile='" + keepalivefile + '\'' +
                        ", msg='" + msg + '\'' +
                        ", retcode=" + retcode +
                        ", servercheck='" + servercheck + '\'' +
                        ", testfile2g='" + testfile2g + '\'' +
                        ", testfilewifi='" + testfilewifi + '\'' +
                        ", uin='" + uin + '\'' +
                        ", userip='" + userip + '\'' +
                        ", vkey='" + vkey + '\'' +
                        ", freeflowsip=" + freeflowsip +
                        ", sip=" + sip +
                        '}';
            }
        }
    }

    public static class Req0Bean implements Serializable {
        /**
         * code : 0
         * data : {"uin":"","retcode":0,"verify_type":0,"login_key":"","msg":"58.19.3.2","sip":["http://ws.stream.qqmusic.qq.com/","http://isure.stream.qqmusic.qq.com/"],"thirdip":["",""],"testfile2g":"C400003mAan70zUy5O.m4a?guid=8348972662&vkey=D3C7DB9AB6C52F08C2FDD9D715D3426BA871F04ECAFAA5DEE0A227C8DC206555449DAE509EB22176E7113741614F33E5015DA350FED41E12&uin=&fromtag=3","testfilewifi":"C400003mAan70zUy5O.m4a?guid=8348972662&vkey=D3C7DB9AB6C52F08C2FDD9D715D3426BA871F04ECAFAA5DEE0A227C8DC206555449DAE509EB22176E7113741614F33E5015DA350FED41E12&uin=&fromtag=3","midurlinfo":[{"songmid":"002wit7s1Tvdlg","filename":"C400000RMeN92LDUm0.m4a","purl":"C400000RMeN92LDUm0.m4a?guid=8348972662&vkey=E7B88F3490FBA862BC3848F786322C333511B8EC6ED2D34BF076334427E29BD30AB49965B44DAE9BD3D9145ADE8445C6E74A769C33191984&uin=&fromtag=66","errtype":"","p2pfromtag":0,"qmdlfromtag":0,"common_downfromtag":0,"vip_downfromtag":0,"pdl":0,"premain":0,"hisdown":0,"hisbuy":0,"uiAlert":0,"isbuy":0,"pneedbuy":0,"pneed":0,"isonly":0,"onecan":0,"result":0,"tips":"","opi48kurl":"","opi96kurl":"","opi192kurl":"","opiflackurl":"","opi128kurl":"","opi192koggurl":"","wififromtag":"","flowfromtag":"","wifiurl":"","flowurl":"","vkey":"E7B88F3490FBA862BC3848F786322C333511B8EC6ED2D34BF076334427E29BD30AB49965B44DAE9BD3D9145ADE8445C6E74A769C33191984","opi30surl":"","ekey":"","auth_switch":16889603,"subcode":0,"opi96koggurl":"","auth_switch2":0}],"servercheck":"eb69f3e351bd6fa0d4d6eb95c5a12620","expiration":80400}
         */

        private int code;
        private DataBeanX data;

        public int getCode() {
            return code;
        }

        public DataBeanX getData() {
            return data;
        }

        @Override
        public String toString() {
            return "Req0Bean{" +
                    "code=" + code +
                    ", data=" + data +
                    '}';
        }

        public static class DataBeanX implements Serializable {
            /**
             * uin :
             * retcode : 0
             * verify_type : 0
             * login_key :
             * msg : 58.19.3.2
             * sip : ["http://ws.stream.qqmusic.qq.com/","http://isure.stream.qqmusic.qq.com/"]
             * thirdip : ["",""]
             * testfile2g : C400003mAan70zUy5O.m4a?guid=8348972662&vkey=D3C7DB9AB6C52F08C2FDD9D715D3426BA871F04ECAFAA5DEE0A227C8DC206555449DAE509EB22176E7113741614F33E5015DA350FED41E12&uin=&fromtag=3
             * testfilewifi : C400003mAan70zUy5O.m4a?guid=8348972662&vkey=D3C7DB9AB6C52F08C2FDD9D715D3426BA871F04ECAFAA5DEE0A227C8DC206555449DAE509EB22176E7113741614F33E5015DA350FED41E12&uin=&fromtag=3
             * midurlinfo : [{"songmid":"002wit7s1Tvdlg","filename":"C400000RMeN92LDUm0.m4a","purl":"C400000RMeN92LDUm0.m4a?guid=8348972662&vkey=E7B88F3490FBA862BC3848F786322C333511B8EC6ED2D34BF076334427E29BD30AB49965B44DAE9BD3D9145ADE8445C6E74A769C33191984&uin=&fromtag=66","errtype":"","p2pfromtag":0,"qmdlfromtag":0,"common_downfromtag":0,"vip_downfromtag":0,"pdl":0,"premain":0,"hisdown":0,"hisbuy":0,"uiAlert":0,"isbuy":0,"pneedbuy":0,"pneed":0,"isonly":0,"onecan":0,"result":0,"tips":"","opi48kurl":"","opi96kurl":"","opi192kurl":"","opiflackurl":"","opi128kurl":"","opi192koggurl":"","wififromtag":"","flowfromtag":"","wifiurl":"","flowurl":"","vkey":"E7B88F3490FBA862BC3848F786322C333511B8EC6ED2D34BF076334427E29BD30AB49965B44DAE9BD3D9145ADE8445C6E74A769C33191984","opi30surl":"","ekey":"","auth_switch":16889603,"subcode":0,"opi96koggurl":"","auth_switch2":0}]
             * servercheck : eb69f3e351bd6fa0d4d6eb95c5a12620
             * expiration : 80400
             */

            private String uin;
            private int retcode;
            private int verify_type;
            private String login_key;
            private String msg;
            private String testfile2g;
            private String testfilewifi;
            private String servercheck;
            private int expiration;
            private List<String> sip;
            private List<String> thirdip;
            private List<MidurlinfoBean> midurlinfo;

            public String getUin() {
                return uin;
            }

            public int getRetcode() {
                return retcode;
            }

            public int getVerify_type() {
                return verify_type;
            }

            public String getLogin_key() {
                return login_key;
            }

            public String getMsg() {
                return msg;
            }

            public String getTestfile2g() {
                return testfile2g;
            }

            public String getTestfilewifi() {
                return testfilewifi;
            }

            public String getServercheck() {
                return servercheck;
            }

            public int getExpiration() {
                return expiration;
            }

            public List<String> getSip() {
                return sip;
            }

            public List<String> getThirdip() {
                return thirdip;
            }

            public List<MidurlinfoBean> getMidurlinfo() {
                return midurlinfo;
            }

            @Override
            public String toString() {
                return "DataBeanX{" +
                        "uin='" + uin + '\'' +
                        ", retcode=" + retcode +
                        ", verify_type=" + verify_type +
                        ", login_key='" + login_key + '\'' +
                        ", msg='" + msg + '\'' +
                        ", testfile2g='" + testfile2g + '\'' +
                        ", testfilewifi='" + testfilewifi + '\'' +
                        ", servercheck='" + servercheck + '\'' +
                        ", expiration=" + expiration +
                        ", sip=" + sip +
                        ", thirdip=" + thirdip +
                        ", midurlinfo=" + midurlinfo +
                        '}';
            }

            public static class MidurlinfoBean implements Serializable {
                /**
                 * songmid : 002wit7s1Tvdlg
                 * filename : C400000RMeN92LDUm0.m4a
                 * purl : C400000RMeN92LDUm0.m4a?guid=8348972662&vkey=E7B88F3490FBA862BC3848F786322C333511B8EC6ED2D34BF076334427E29BD30AB49965B44DAE9BD3D9145ADE8445C6E74A769C33191984&uin=&fromtag=66
                 * errtype :
                 * p2pfromtag : 0
                 * qmdlfromtag : 0
                 * common_downfromtag : 0
                 * vip_downfromtag : 0
                 * pdl : 0
                 * premain : 0
                 * hisdown : 0
                 * hisbuy : 0
                 * uiAlert : 0
                 * isbuy : 0
                 * pneedbuy : 0
                 * pneed : 0
                 * isonly : 0
                 * onecan : 0
                 * result : 0
                 * tips :
                 * opi48kurl :
                 * opi96kurl :
                 * opi192kurl :
                 * opiflackurl :
                 * opi128kurl :
                 * opi192koggurl :
                 * wififromtag :
                 * flowfromtag :
                 * wifiurl :
                 * flowurl :
                 * vkey : E7B88F3490FBA862BC3848F786322C333511B8EC6ED2D34BF076334427E29BD30AB49965B44DAE9BD3D9145ADE8445C6E74A769C33191984
                 * opi30surl :
                 * ekey :
                 * auth_switch : 16889603
                 * subcode : 0
                 * opi96koggurl :
                 * auth_switch2 : 0
                 */

                private String songmid;
                private String filename;
                private String purl;
                private String errtype;
                private int p2pfromtag;
                private int qmdlfromtag;
                private int common_downfromtag;
                private int vip_downfromtag;
                private int pdl;
                private int premain;
                private int hisdown;
                private int hisbuy;
                private int uiAlert;
                private int isbuy;
                private int pneedbuy;
                private int pneed;
                private int isonly;
                private int onecan;
                private int result;
                private String tips;
                private String opi48kurl;
                private String opi96kurl;
                private String opi192kurl;
                private String opiflackurl;
                private String opi128kurl;
                private String opi192koggurl;
                private String wififromtag;
                private String flowfromtag;
                private String wifiurl;
                private String flowurl;
                private String vkey;
                private String opi30surl;
                private String ekey;
                private int auth_switch;
                private int subcode;
                private String opi96koggurl;
                private int auth_switch2;

                public String getSongmid() {
                    return songmid;
                }

                public String getFilename() {
                    return filename;
                }

                public String getPurl() {
                    return purl;
                }

                public String getErrtype() {
                    return errtype;
                }

                public int getP2pfromtag() {
                    return p2pfromtag;
                }

                public int getQmdlfromtag() {
                    return qmdlfromtag;
                }

                public int getCommon_downfromtag() {
                    return common_downfromtag;
                }

                public int getVip_downfromtag() {
                    return vip_downfromtag;
                }

                public int getPdl() {
                    return pdl;
                }

                public int getPremain() {
                    return premain;
                }

                public int getHisdown() {
                    return hisdown;
                }

                public int getHisbuy() {
                    return hisbuy;
                }

                public int getUiAlert() {
                    return uiAlert;
                }

                public int getIsbuy() {
                    return isbuy;
                }

                public int getPneedbuy() {
                    return pneedbuy;
                }

                public int getPneed() {
                    return pneed;
                }

                public int getIsonly() {
                    return isonly;
                }

                public int getOnecan() {
                    return onecan;
                }

                public int getResult() {
                    return result;
                }

                public String getTips() {
                    return tips;
                }

                public String getOpi48kurl() {
                    return opi48kurl;
                }

                public String getOpi96kurl() {
                    return opi96kurl;
                }

                public String getOpi192kurl() {
                    return opi192kurl;
                }

                public String getOpiflackurl() {
                    return opiflackurl;
                }

                public String getOpi128kurl() {
                    return opi128kurl;
                }

                public String getOpi192koggurl() {
                    return opi192koggurl;
                }

                public String getWififromtag() {
                    return wififromtag;
                }

                public String getFlowfromtag() {
                    return flowfromtag;
                }

                public String getWifiurl() {
                    return wifiurl;
                }

                public String getFlowurl() {
                    return flowurl;
                }

                public String getVkey() {
                    return vkey;
                }

                public String getOpi30surl() {
                    return opi30surl;
                }

                public String getEkey() {
                    return ekey;
                }

                public int getAuth_switch() {
                    return auth_switch;
                }

                public int getSubcode() {
                    return subcode;
                }

                public String getOpi96koggurl() {
                    return opi96koggurl;
                }

                public int getAuth_switch2() {
                    return auth_switch2;
                }
            }
        }
    }
}
