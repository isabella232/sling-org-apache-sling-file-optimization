/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.sling.fileoptim.models;

import java.io.InputStream;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.jackrabbit.JcrConstants;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.fileoptim.FileOptimizerConstants;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;

/**
 * Sling Model representing a file which can be or has been optimized.
 */
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public interface OptimizedFile {

	@Named(FileOptimizerConstants.PN_ALGORITHM)
	@Inject
	String getAlgorithm();

	@Named(FileOptimizerConstants.PN_DISABLED)
	@Inject
	@Default(booleanValues = false)
	boolean getDisabled();

	@Named(JcrConstants.JCR_DATA)
	@Inject
	@Required
	InputStream getContent();

	@Named(FileOptimizerConstants.PN_HASH)
	@Inject
	String getHash();

	@Named(JcrConstants.JCR_MIMETYPE)
	@Inject
	@Required
	String getMimeType();

	@Named(FileOptimizerConstants.PN_ORIGINAL)
	@Inject
	InputStream getOriginal();

	@Named(FileOptimizerConstants.PN_SAVINGS)
	@Inject
	double getSavings();

}
