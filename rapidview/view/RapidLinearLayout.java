/***************************************************************************************************
 Tencent is pleased to support the open source community by making RapidView available.
 Copyright (C) 2017 THL A29 Limited, a Tencent company. All rights reserved.
 Licensed under the MITLicense (the "License"); you may not use this file except in compliance
 withthe License. You mayobtain a copy of the License at

 http://opensource.org/licenses/MIT

 Unless required by applicable law or agreed to in writing, software distributed under the License is
 distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 implied. See the License for the specific language governing permissions and limitations under the
 License.
 ***************************************************************************************************/
package com.tencent.rapidview.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.tencent.rapidview.param.LinearLayoutParams;
import com.tencent.rapidview.param.ParamsObject;
import com.tencent.rapidview.parser.LinearLayoutParser;
import com.tencent.rapidview.parser.RapidParserObject;

/**
 * @Class RapidLinearLayout
 * @Desc 光子界面LinearLayout
 *
 * @author arlozhang
 * @date 2015.10.08
 */
public class RapidLinearLayout extends RapidViewGroupObject {

    public RapidLinearLayout(){}

    @Override
    protected RapidParserObject createParser(){
        return new LinearLayoutParser();
    }

    @Override
    protected View createView(Context context){
        return new LinearLayout(context);
    }

    @Override
    public ParamsObject createParams(Context context){
        return new LinearLayoutParams(context);
    }
}
