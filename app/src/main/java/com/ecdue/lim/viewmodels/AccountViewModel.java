package com.ecdue.lim.viewmodels;

import androidx.lifecycle.ViewModel;

import com.ecdue.lim.events.SignOutEvent;

import org.greenrobot.eventbus.EventBus;

public class AccountViewModel extends ViewModel {
    public AccountViewModel(){

    }
    public void onSignOutClicked(){
        EventBus.getDefault().post(new SignOutEvent(""));
    }
}
