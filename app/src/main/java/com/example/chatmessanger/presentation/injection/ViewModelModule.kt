package com.example.chatmessanger.presentation.injection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.chatmessanger.presentation.viewmodel.AccountViewModel
import com.example.chatmessanger.presentation.viewmodel.FriendsViewModel
import com.example.chatmessanger.presentation.viewmodel.MediaViewModel
import com.example.chatmessanger.presentation.viewmodel.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(AccountViewModel::class)
    abstract fun bindAccountViewModel(accountViewModel: AccountViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FriendsViewModel::class)
    abstract fun bindFriendsViewModel(friendsViewModel: FriendsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MediaViewModel::class)
    abstract fun bindMediaViewModel(mediaViewModel: MediaViewModel): ViewModel
}