package com.adamisionapp.adamrizaldy.click;

import com.adamisionapp.adamrizaldy.entity.Friends;

import java.util.ArrayList;

/** 10116295 ADAM ARIS RIZALDY*/

public interface LoadFriendsCallback {
    void preExecute();
    void postExecute(ArrayList<Friends> friends);
}
