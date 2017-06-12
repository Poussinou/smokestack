/*
** Copyright (c) Alexis Megas.
** All rights reserved.
**
** Redistribution and use in source and binary forms, with or without
** modification, are permitted provided that the following conditions
** are met:
** 1. Redistributions of source code must retain the above copyright
**    notice, this list of conditions and the following disclaimer.
** 2. Redistributions in binary form must reproduce the above copyright
**    notice, this list of conditions and the following disclaimer in the
**    documentation and/or other materials provided with the distribution.
** 3. The name of the author may not be used to endorse or promote products
**    derived from SmokeStack without specific prior written permission.
**
** SMOKESTACK IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
** IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
** OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
** IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
** INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
** NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
** DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
** THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
** (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
** SMOKESTACK, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

package org.purple.smokestack;

import java.util.concurrent.atomic.AtomicInteger;

public class TcpListener
{
    private AtomicInteger m_listen = null;
    private AtomicInteger m_oid;
    private String m_ipAddress = "";
    private String m_ipPort = "";
    private String m_scopeId = "";
    private String m_version = "";

    public TcpListener(String ipAddress,
		       String ipPort,
		       String scopeId,
		       String version,
		       int oid)
    {
	m_ipAddress = ipAddress;
	m_ipPort = ipPort;
	m_listen = new AtomicInteger(0);
	m_oid = new AtomicInteger(oid);
	m_scopeId = scopeId;
	m_version = version;
    }

    public void disconnect()
    {
	m_listen.set(0);
    }

    public void listen()
    {
	m_listen.set(1);
    }
}