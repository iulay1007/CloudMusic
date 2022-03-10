package com.example.cloudmusic.ui.homepage.model;

import java.io.Serializable;
import java.util.List;

public class KeyBody implements Serializable {
    /**
     * req : {"module":"CDN.SrfCdnDispatchServer","method":"GetCdnDispatch","param":{"guid":"8348972662","calltype":0,"userip":""}}
     * req_0 : {"module":"vkey.GetVkeyServer","method":"CgiGetVkey","param":{"guid":"8348972662","songmid":["002wit7s1Tvdlg"],"songtype":[1],"uin":"0","loginflag":1,"platform":"20"}}
     * comm : {"uin":0,"format":"json","ct":24,"cv":0}
     */

    private ReqBean req;
    private Req0Bean req_0;
    private CommBean comm;

    public KeyBody(ReqBean req, Req0Bean req_0, CommBean comm) {
        this.req = req;
        this.req_0 = req_0;
        this.comm = comm;
    }

    public ReqBean getReq() {
        return req;
    }

    public Req0Bean getReq_0() {
        return req_0;
    }

    public CommBean getComm() {
        return comm;
    }

    public static class ReqBean implements Serializable {
        /**
         * module : CDN.SrfCdnDispatchServer
         * method : GetCdnDispatch
         * param : {"guid":"8348972662","calltype":0,"userip":""}
         */

        private String module;
        private String method;
        private ParamBean param;

        public ReqBean(String module, String method, ParamBean param) {
            this.module = module;
            this.method = method;
            this.param = param;
        }

        public String getModule() {
            return module;
        }

        public String getMethod() {
            return method;
        }

        public ParamBean getParam() {
            return param;
        }

        public static class ParamBean implements Serializable {
            /**
             * guid : 8348972662
             * calltype : 0
             * userip :
             */

            private String guid;
            private int calltype;
            private String userip;

            public ParamBean(String guid, int calltype, String userip) {
                this.guid = guid;
                this.calltype = calltype;
                this.userip = userip;
            }

            public String getGuid() {
                return guid;
            }

            public int getCalltype() {
                return calltype;
            }

            public String getUserip() {
                return userip;
            }
        }
    }

    public static class Req0Bean implements Serializable {
        /**
         * module : vkey.GetVkeyServer
         * method : CgiGetVkey
         * param : {"guid":"8348972662","songmid":["002wit7s1Tvdlg"],"songtype":[1],"uin":"0","loginflag":1,"platform":"20"}
         */

        private String module;
        private String method;
        private ParamBeanX param;

        public Req0Bean(String module, String method, ParamBeanX param) {
            this.module = module;
            this.method = method;
            this.param = param;
        }

        public String getModule() {
            return module;
        }

        public String getMethod() {
            return method;
        }

        public ParamBeanX getParam() {
            return param;
        }

        public static class ParamBeanX implements Serializable {
            /**
             * guid : 8348972662
             * songmid : ["002wit7s1Tvdlg"]
             * songtype : [1]
             * uin : 0
             * loginflag : 1
             * platform : 20
             */

            private String guid;
            private String uin;
            private int loginflag;
            private String platform;
            private List<String> songmid;
            private List<Integer> songtype;

            public ParamBeanX(String guid, String uin, int loginflag, String platform, List<String> songmid, List<Integer> songtype) {
                this.guid = guid;
                this.uin = uin;
                this.loginflag = loginflag;
                this.platform = platform;
                this.songmid = songmid;
                this.songtype = songtype;
            }

            public String getGuid() {
                return guid;
            }

            public String getUin() {
                return uin;
            }

            public int getLoginflag() {
                return loginflag;
            }

            public String getPlatform() {
                return platform;
            }

            public List<String> getSongmid() {
                return songmid;
            }

            public List<Integer> getSongtype() {
                return songtype;
            }
        }
    }

    public static class CommBean implements Serializable {
        /**
         * uin : 0
         * format : json
         * ct : 24
         * cv : 0
         */

        private int uin;
        private String format;
        private int ct;
        private int cv;

        public CommBean(int uin, String format, int ct, int cv) {
            this.uin = uin;
            this.format = format;
            this.ct = ct;
            this.cv = cv;
        }

        public int getUin() {
            return uin;
        }

        public String getFormat() {
            return format;
        }

        public int getCt() {
            return ct;
        }

        public int getCv() {
            return cv;
        }
    }
}
