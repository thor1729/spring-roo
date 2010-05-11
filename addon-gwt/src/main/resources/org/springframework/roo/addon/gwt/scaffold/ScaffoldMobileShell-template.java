/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package __TOP_LEVEL_PACKAGE__.gwt.scaffold;

import com.google.gwt.app.place.PlacePickerView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import __TOP_LEVEL_PACKAGE__.gwt.scaffold.place.ApplicationListPlace;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * TODO
 */
public class ScaffoldMobileShell extends Composite {

  interface Binder extends UiBinder<Widget, ScaffoldMobileShell> { }
  private static final Binder BINDER = GWT.create(Binder.class);

  @UiField SimplePanel body;
  @UiField DivElement error;
  @UiField PlacePickerView<ApplicationListPlace> placesBox;

  public ScaffoldMobileShell() {
    initWidget(BINDER.createAndBindUi(this));
  }

  /**
   * @return the body
   */
  public SimplePanel getBody() {
    return body;
  }

  public PlacePickerView<ApplicationListPlace> getPlacesBox() {
    return placesBox;
  }

  /**
   * @param string
   */
  public void setError(String string) {
    error.setInnerText(string);
  }
}
