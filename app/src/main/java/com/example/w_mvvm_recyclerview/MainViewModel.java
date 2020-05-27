package com.example.w_mvvm_recyclerview;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {
    private MutableLiveData<List<User>> users;
    private String TAG ="hank";


    public LiveData<List<User>> getUsers(){
        if(users == null){
            users = new MutableLiveData<>();
            Log.v(TAG,"ViewModel=>getUsers");
            loadUsers();
        }
        return  users;
    }

    public void loadUsers(){
        User user = new User("hank","18","台中");
        List<User> a = new ArrayList<>();
        a.add(user);
        users.setValue(a);
        Log.v(TAG,"ViewModel=>loadUsers");
    }
}
