package id.co.egifcb.suratal_quran.activity.main

import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener
import id.co.egifcb.suratal_quran.model.Response

class MainPresenter(private val mainView: MainView) {
    fun getSurat() {
        mainView.showLoading()
        AndroidNetworking.get("https://api.banghasan.com/quran/format/json/surat")
                .setTag("hasil")
                .setPriority(Priority.LOW)
                .build()
                .getAsObject(Response::class.java, object : ParsedRequestListener<Response> {
                    override fun onResponse(response: Response?) {
                        mainView.onRespone(response?.hasil)
                        mainView.hideLoading()
                    }

                    override fun onError(anError: ANError?) {
                        mainView.onError(anError?.message.toString())
                        mainView.hideLoading()
                    }

                })
    }
}