package com.calculator.controllers

import play.api.mvc.{Action, Controller}

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by Donald Pollock on 07/11/2017.
  */
class CalculatorController extends Controller{
  val sample = Action.async { request =>
    val result = Future("Fine Result")
    result.map { res =>
      Ok(res)
    }.recover({
      case ex => Ok("Server down")
    })
  }
}
