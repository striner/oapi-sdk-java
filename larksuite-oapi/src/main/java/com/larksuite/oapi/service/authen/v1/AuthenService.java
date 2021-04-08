// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.authen.v1;

import com.larksuite.oapi.core.api.AccessTokenType;
import com.larksuite.oapi.core.api.Api;
import com.larksuite.oapi.core.api.ReqCaller;
import com.larksuite.oapi.core.api.request.*;
import com.larksuite.oapi.core.api.response.*;
import com.larksuite.oapi.core.Config;
import com.larksuite.oapi.service.authen.v1.model.*;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class AuthenService {

    private final Config config;
    private final Authens authens;

    public AuthenService(Config config) {
        this.config = config;
        this.authens = new Authens(this);
    }

    public Authens getAuthens() {
        return authens;
    }

    public static class Authens {

        private final AuthenService service;

        public Authens(AuthenService service) {
            this.service = service;
        }
    
        public AuthenAccessTokenReqCall accessToken(AuthenAccessTokenReqBody body, RequestOptFn... optFns) {
            return new AuthenAccessTokenReqCall(this, body, optFns);
        }
    
        public AuthenRefreshAccessTokenReqCall refreshAccessToken(AuthenRefreshAccessTokenReqBody body, RequestOptFn... optFns) {
            return new AuthenRefreshAccessTokenReqCall(this, body, optFns);
        }
    
        public AuthenUserInfoReqCall userInfo(RequestOptFn... optFns) {
            return new AuthenUserInfoReqCall(this, optFns);
        }
    
    }
    public static class AuthenAccessTokenReqCall extends ReqCaller<AuthenAccessTokenReqBody, UserAccessTokenInfo> {
        private final Authens authens;
        
        private final AuthenAccessTokenReqBody body;
        private final List<RequestOptFn> optFns;
        private UserAccessTokenInfo result;
        
        private AuthenAccessTokenReqCall(Authens authens, AuthenAccessTokenReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new UserAccessTokenInfo();
            this.authens = authens;
        }
        

        @Override
        public Response<UserAccessTokenInfo> execute() throws Exception {
            Request<AuthenAccessTokenReqBody, UserAccessTokenInfo> request = Request.newRequest("authen/v1/access_token", "POST",
                    new AccessTokenType[]{AccessTokenType.App},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.authens.service.config, request);
        }
    }
    public static class AuthenRefreshAccessTokenReqCall extends ReqCaller<AuthenRefreshAccessTokenReqBody, UserAccessTokenInfo> {
        private final Authens authens;
        
        private final AuthenRefreshAccessTokenReqBody body;
        private final List<RequestOptFn> optFns;
        private UserAccessTokenInfo result;
        
        private AuthenRefreshAccessTokenReqCall(Authens authens, AuthenRefreshAccessTokenReqBody body, RequestOptFn... optFns) {
        
            this.body = body;
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new UserAccessTokenInfo();
            this.authens = authens;
        }
        

        @Override
        public Response<UserAccessTokenInfo> execute() throws Exception {
            Request<AuthenRefreshAccessTokenReqBody, UserAccessTokenInfo> request = Request.newRequest("authen/v1/refresh_access_token", "POST",
                    new AccessTokenType[]{AccessTokenType.App},
                    this.body, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.authens.service.config, request);
        }
    }
    public static class AuthenUserInfoReqCall extends ReqCaller<Object, UserInfo> {
        private final Authens authens;
        
        private final List<RequestOptFn> optFns;
        private UserInfo result;
        
        private AuthenUserInfoReqCall(Authens authens, RequestOptFn... optFns) {
        
            this.optFns = new ArrayList<>();
            this.optFns.addAll(Arrays.asList(optFns));
            this.result = new UserInfo();
            this.authens = authens;
        }
        

        @Override
        public Response<UserInfo> execute() throws Exception {
            Request<Object, UserInfo> request = Request.newRequest("authen/v1/user_info", "GET",
                    new AccessTokenType[]{AccessTokenType.User},
                    null, this.result, this.optFns.toArray(new RequestOptFn[]{}));
            return Api.send(this.authens.service.config, request);
        }
    }

}
