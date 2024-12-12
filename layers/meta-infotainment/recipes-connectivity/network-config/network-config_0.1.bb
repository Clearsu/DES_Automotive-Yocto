SUMMARY = "Network configuration"
DESCRIPTION = "Provides /etc/network/interfaces for automatic WiFi connection"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://interfaces"

do_install() {
    install -d ${D}${sysconfdir}/network
    install -m 0644 ${WORKDIR}/interfaces ${D}${sysconfdir}/network/interfaces
}
