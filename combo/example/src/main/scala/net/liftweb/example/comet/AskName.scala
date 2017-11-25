/*
 * Copyright 2007-2010 WorldWide Conferencing, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.liftweb {
package example {
package comet {

import _root_.net.liftweb.http._
import S._
import SHtml._
import _root_.net.liftweb.common._
import _root_.net.liftweb.util._
import _root_.scala.xml._

class AskName extends CometActor {
  def render =
  ajaxForm(<div>What is your username?</div> ++
      <div class="form-group row">
        <div class="col-sm-8">
          {text("",name => answer(name.trim), "class" -> "form-control form-control-sm")}
        </div>
        <div class="col-sm-2">
          <input type="submit" value="Enter" class="btn btn-outline-primary btn-sm"/>
        </div>
      </div>)
}

}
}
}
