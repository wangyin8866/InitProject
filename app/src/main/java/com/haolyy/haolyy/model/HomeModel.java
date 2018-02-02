package com.haolyy.haolyy.model;


import com.haolyy.haolyy.service.HomeAPi;

/**
 * Created by haolyy on 2017/6/29.
 */

public class HomeModel extends BaseModel {
    private HomeAPi homeAPi;

    private HomeModel() {
        super();
        homeAPi = retrofit.create(HomeAPi.class);
    }

    private static class SingletonHolder {
        private static final HomeModel homeModel = new HomeModel();
    }

    public static HomeModel getInstance() {
        return SingletonHolder.homeModel;
    }

   /* public Observable<Banner> getBanner(String type) {
        map.clear();
        map.put("type", type);
        map.put("platform", platform);
        map.put("client", client);
        return homeAPi.getBanner(map);
    }
  */

}
