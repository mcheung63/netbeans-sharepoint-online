// License : Apache License Version 2.0  https://www.apache.org/licenses/LICENSE-2.0
package com.github.quantrresearch.sharepoint.online.datastructure;

/**
 *
 * @author Peter <mcheung63@hotmail.com>
 */
public class ServerInfo {

	public String domain;
	public String username;
	public String password;
	public String path;

	public ServerInfo(String domain, String username, String password, String path) {
		this.domain = domain;
		this.username = username;
		this.password = password;
		this.path = path;
	}

}
