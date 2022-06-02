package com.fjz.bankline_android.ui.statement

import androidx.lifecycle.ViewModel
import com.fjz.bankline_android.data.BanklineRepository

class BankStatementViewModel :ViewModel(){
    fun findBBankStatement(accountHolderId:Int)=
        BanklineRepository.findBankStatement(accountHolderId)
}