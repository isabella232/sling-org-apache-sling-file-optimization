/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sling.fileoptim;

public class FileOptimizerConstants {

	private FileOptimizerConstants() {
	}

	public static final String MIME_TYPE = "mime.type";
	public static final String PREFIX = "optim:";
	public static final String MT_OPTIMIZED = PREFIX + "optimized";
	public static final String PN_ALGORITHM = FileOptimizerConstants.PREFIX + "algrithm";
	public static final String PN_DISABLED = FileOptimizerConstants.PREFIX + "disabled";
	public static final String PN_HASH = FileOptimizerConstants.PREFIX + "hash";
	public static final String PN_ORIGINAL = FileOptimizerConstants.PREFIX + "original";
	public static final String PN_SAVINGS = FileOptimizerConstants.PREFIX + "savings";

}
