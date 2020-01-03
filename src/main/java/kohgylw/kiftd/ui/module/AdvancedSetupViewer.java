package kohgylw.kiftd.ui.module;

import javax.swing.*;

/**
 * 高级设置
 */
public class AdvancedSetupViewer extends KiftdDynamicWindow {

    protected static JDialog window;// 窗体对象
    private static volatile AdvancedSetupViewer asv;// 该窗口的唯一实例

    // 资源加载
    private AdvancedSetupViewer() {
        setUIFont();
        // 窗口主体相关设置
        (AdvancedSetupViewer.window = new JDialog(ServerUIModule.window, "kiftd-高级设置")).setModal(true);
        AdvancedSetupViewer.window.setSize(420, 425);
        AdvancedSetupViewer.window.setLocation(150, 150);
        AdvancedSetupViewer.window.setDefaultCloseOperation(1);
        AdvancedSetupViewer.window.setResizable(false);
        AdvancedSetupViewer.window.setLayout(new BoxLayout(AdvancedSetupViewer.window.getContentPane(), 3));
    }

    /**
     * 获取高级设置实例
     * @return 高级设置实例
     */
    public static AdvancedSetupViewer getInstance() {
        if (asv == null) {
            synchronized (AdvancedSetupViewer.class) {
                asv = new AdvancedSetupViewer();
            }
        }
        return asv;
    }

    /**
     * 展示高级设置界面
     */
    public void show() {
        this.getServerStatus();
        AdvancedSetupViewer.window.setVisible(true);
    }

    private void getServerStatus() {
        final Thread t = new Thread(() -> {
            if (SettingWindow.st != null) {
//                SettingWindow.bufferinput
//                        .setText(SettingWindow.st.getBufferSize() == 0 ? SettingWindow.st.getInitBufferSize()
//                                : SettingWindow.st.getBufferSize() / 1024 + "");
//                SettingWindow.portinput.setText(SettingWindow.st.getPort() == 0 ? SettingWindow.st.getInitProt() + ""
//                        : SettingWindow.st.getPort() + "");
                if (SettingWindow.st.getFileSystemPath() != null) {
//                    chooserPath = new File(SettingWindow.st.getFileSystemPath());
                } else {
//                    chooserPath = new File(SettingWindow.st.getInitFileSystemPath());
                }
//                extendStores = SettingWindow.st.getExtendStores();
                if (SettingWindow.st.getLogLevel() != null) {
                    switch (SettingWindow.st.getLogLevel()) {
                        case Event: {
//                            SettingWindow.logLevelinput.setSelectedIndex(0);
                            break;
                        }
                        case Runtime_Exception: {
//                            SettingWindow.logLevelinput.setSelectedIndex(1);
                            break;
                        }
                        case None: {
//                            SettingWindow.logLevelinput.setSelectedIndex(2);
                            break;
                        }
                    }
                } else {
                    switch (SettingWindow.st.getInitLogLevel()) {
                        case Event: {
//                            SettingWindow.logLevelinput.setSelectedIndex(0);
                            break;
                        }
                        case Runtime_Exception: {
//                            SettingWindow.logLevelinput.setSelectedIndex(1);
                            break;
                        }
                        case None: {
//                            SettingWindow.logLevelinput.setSelectedIndex(2);
                            break;
                        }
                    }
                }
                if (SettingWindow.st.getMustLogin()) {
//                    SettingWindow.mlinput.setSelectedIndex(0);
                } else {
//                    SettingWindow.mlinput.setSelectedIndex(1);
                }
                if (SettingWindow.st.isAllowChangePassword()) {
//                    SettingWindow.changePwdinput.setSelectedIndex(1);
                } else {
//                    SettingWindow.changePwdinput.setSelectedIndex(0);
                }
                if (SettingWindow.st.isOpenFileChain()) {
//                    SettingWindow.showChaininput.setSelectedIndex(1);
                } else {
//                    SettingWindow.showChaininput.setSelectedIndex(0);
                }
                if (SettingWindow.st.getVCLevel() != null) {
                    switch (SettingWindow.st.getVCLevel()) {
//                        case Standard: {
//                            SettingWindow.vcinput.setSelectedIndex(0);
//                            break;
//                        }
//                        case Simplified: {
//                            SettingWindow.vcinput.setSelectedIndex(1);
//                            break;
//                        }
//                        case Close: {
//                            SettingWindow.vcinput.setSelectedIndex(2);
//                            break;
//                        }
                    }
                } else {
                    switch (SettingWindow.st.getInitVCLevel()) {
//                        case Standard: {
//                            SettingWindow.vcinput.setSelectedIndex(0);
//                            break;
//                        }
//                        case Simplified: {
//                            SettingWindow.vcinput.setSelectedIndex(1);
//                            break;
//                        }
//                        case Close: {
//                            SettingWindow.vcinput.setSelectedIndex(2);
//                            break;
//                        }
                    }
                }
            }
            return;
        });
        t.start();
    }
}
