package evonyproxy.evony.common.server.events;

import flex.messaging.io.amf.ASObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import evonyproxy.evony.EvonyPacket;
import flex.messaging.io.ArrayCollection;
import evonyproxy.evony.common.beans.*;

/**
* @version .02
* @author Michael Archibald
*/
public class ResourceUpdate implements EvonyPacket {
public Double packageId = null;
public String msg = null;
public CastleResourceBean resource = null;
public Integer castleId = null;
public String errorMsg = null;
public Integer ok = null;

public ResourceUpdate(ASObject aso) {

if(aso.get("packageId") != null) {
this.packageId = (Double) aso.get("packageId");
}

if(aso.get("msg") != null) {
this.msg = (String) aso.get("msg");
}

if(aso.get("resource") != null) {
this.resource = new CastleResourceBean((ASObject) aso.get("resource"));
}

if(aso.get("castleId") != null) {
this.castleId = (Integer) aso.get("castleId");
}

if(aso.get("errorMsg") != null) {
this.errorMsg = (String) aso.get("errorMsg");
}

if(aso.get("ok") != null) {
this.ok = (Integer) aso.get("ok");
}
}

public ResourceUpdate() {
}

@Override
public ResourceUpdate clone() {
ResourceUpdate clone = new ResourceUpdate();

if(this.packageId != null) {
clone.setPackageId(this.packageId);
}

if(this.msg != null) {
clone.setMsg(this.msg);
}

if(this.resource != null) {
clone.setResource(this.resource);
}

if(this.castleId != null) {
clone.setCastleId(this.castleId);
}

if(this.errorMsg != null) {
clone.setErrorMsg(this.errorMsg);
}

if(this.ok != null) {
clone.setOk(this.ok);
}

return clone;
}

public ASObject toASObject() {
ASObject aso = new ASObject();

if(this.packageId != null) {
aso.put("packageId", packageId);
}

if(this.msg != null) {
aso.put("msg", msg);
}

if(this.resource != null) {
aso.put("resource", resource.toASObject());
}

if(this.castleId != null) {
aso.put("castleId", castleId);
}

if(this.errorMsg != null) {
aso.put("errorMsg", errorMsg);
}

if(this.ok != null) {
aso.put("ok", ok);
}

return aso;
}

public Double getPackageId() {
return packageId;
}

public void setPackageId(Double packageId) {
this.packageId = packageId;
}

public String getMsg() {
return msg;
}

public void setMsg(String msg) {
this.msg = msg;
}

public CastleResourceBean getResource() {
return resource;
}

public void setResource(CastleResourceBean resource) {
this.resource = resource;
}

public Integer getCastleId() {
return castleId;
}

public void setCastleId(Integer castleId) {
this.castleId = castleId;
}

public String getErrorMsg() {
return errorMsg;
}

public void setErrorMsg(String errorMsg) {
this.errorMsg = errorMsg;
}

public Integer getOk() {
return ok;
}

public void setOk(Integer ok) {
this.ok = ok;
}
}
