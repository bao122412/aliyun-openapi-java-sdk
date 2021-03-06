/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.oam.transform.v20170101;

import com.aliyuncs.oam.model.v20170101.AddTagMiddleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddTagMiddleResponseUnmarshaller {

	public static AddTagMiddleResponse unmarshall(AddTagMiddleResponse addTagMiddleResponse, UnmarshallerContext _ctx) {
		
		addTagMiddleResponse.setRequestId(_ctx.stringValue("AddTagMiddleResponse.RequestId"));
		addTagMiddleResponse.setCode(_ctx.stringValue("AddTagMiddleResponse.Code"));
		addTagMiddleResponse.setMessage(_ctx.stringValue("AddTagMiddleResponse.Message"));
	 
	 	return addTagMiddleResponse;
	}
}