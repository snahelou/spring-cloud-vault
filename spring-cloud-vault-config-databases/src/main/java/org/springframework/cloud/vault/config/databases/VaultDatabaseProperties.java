/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.vault.config.databases;

import javax.validation.constraints.NotEmpty;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

/**
 * Configuration properties for Vault using the Database integration.
 *
 * @author Per Abich
 * @since 2.0
 */
@ConfigurationProperties("spring.cloud.vault.database")
@Validated
public class VaultDatabaseProperties implements DatabaseSecretProperties {

	/**
	 * Enable database backend usage.
	 */
	private boolean enabled = false;

	/**
	 * Role name for credentials.
	 */
	private String role;

	/**
	 * Database backend path.
	 */
	@NotEmpty
	private String backend = "database";

	/**
	 * Target property for the obtained username.
	 */
	@NotEmpty
	private String usernameProperty = "spring.datasource.username";

	/**
	 * Target property for the obtained password.
	 */
	@NotEmpty
	private String passwordProperty = "spring.datasource.password";

	public boolean isEnabled() {
		return this.enabled;
	}

	public String getRole() {
		return this.role;
	}

	public String getBackend() {
		return this.backend;
	}

	public String getUsernameProperty() {
		return this.usernameProperty;
	}

	public String getPasswordProperty() {
		return this.passwordProperty;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setBackend(String backend) {
		this.backend = backend;
	}

	public void setUsernameProperty(String usernameProperty) {
		this.usernameProperty = usernameProperty;
	}

	public void setPasswordProperty(String passwordProperty) {
		this.passwordProperty = passwordProperty;
	}

}
