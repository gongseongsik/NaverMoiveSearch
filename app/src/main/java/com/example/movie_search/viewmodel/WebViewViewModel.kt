package com.example.movie_search.viewmodel

import android.webkit.WebView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

class WebViewViewModel : ViewModel() {

    val webViewUrl = MutableLiveData<String>().apply{ value = "file:///android_asset/html_files/gallery_page.html" }

    companion object WebViewUrlLoader {
        @BindingAdapter("loadUrl")
        @JvmStatic
        fun WebView.setUrl(url: String) {
            this.loadUrl(url)
        }
    }
}