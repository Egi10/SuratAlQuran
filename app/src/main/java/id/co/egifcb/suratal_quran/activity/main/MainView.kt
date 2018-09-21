package id.co.egifcb.suratal_quran.activity.main

import id.co.egifcb.suratal_quran.model.Surat

interface MainView {
    fun showLoading()
    fun onRespone(hasil: ArrayList<Surat>?)
    fun onError(message: String?)
    fun hideLoading()
}