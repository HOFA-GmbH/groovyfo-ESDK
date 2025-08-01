/**
*  ow1/GROOVYFO.UNITTEST
*/

Log.info("cTest");
Log.debug("cTest 2");
Log.error("cTest 3");

art("int","xi","xj")
u.xi = 1
u.xj = 1
assert u.xi == u.xj && u.xi == 1
u.xi++
assert u.xi > u.xj
u.xi--
assert u.xi == u.xj

art("real","xri","xrj")
u.xri = 1
u.xrj = 1
assert u.xri == u.xrj && u.xri == 1
u.xri++
assert u.xri > u.xrj
u.xri--
assert u.xri == u.xrj

art("TEXT","xt1","xt2")
u.xt1 = "Geht"
u.xt2 = "Geht nicht"
assert u.xt1 == "Geht"
assert u.xt1 != u.xt2
u.xt1 += " nicht"
assert u.xt1 == u.xt2
def foo = u.xt1+" "+u.xt2
assert foo.equals("Geht nicht Geht nicht")


//TODO Funktionen prüfen F|....
assert F.regmatch("u|xt1", "Geht nicht") == true


art("GD","xvon","xbis")
u.xvon = "."
u.xbis = "."
assert u.xvon == u.xbis
assert (u.xvon - u.xbis) == 0
u.xbis++
assert u.xvon < u.xbis
u.xvon = u.xvon + 2
assert u.xvon > u.xbis
// ist ein Sonntag
u.xvon = "10.05.2020"
u.xbis = "12.05.2020"
assert (u.xvon % 7) == 7
assert (u.xvon % 1) == "Sonntag"
assert (u.xvon & u.xbis) == 1
// nächste Arbeitstag
u.xvon = u.xvon & 0
u.xbis = "11.05.2020"
assert u.xvon == u.xbis


hole("Teil","\$,,@gruppe=1;")
if(mehr){
        assert h.zuplatz != null
        assert (h.zuplatz^"id") != null
        assert (h.zuplatz^id) != null
        assert (h.zuplatz^"id") == (h.zuplatz^id)
}


art("R7.2","xa","xb")

u.xa = 0.7;
u.xb = 0.9;
u.xa = u.xa + 0.1;
u.xb = u.xb - 0.1;
assert u.xa == u.xb

def date = Date.parse("dd.MM.yyyy", "01.01.2020")
assert date != null

println "Alle Tests erfolgreich bestanden"