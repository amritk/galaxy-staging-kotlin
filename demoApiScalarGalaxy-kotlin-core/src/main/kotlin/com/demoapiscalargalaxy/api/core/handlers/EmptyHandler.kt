@file:JvmName("EmptyHandler")

package com.demoapiscalargalaxy.api.core.handlers

import com.demoapiscalargalaxy.api.core.http.HttpResponse
import com.demoapiscalargalaxy.api.core.http.HttpResponse.Handler

internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
