// License : Apache License Version 2.0  https://www.apache.org/licenses/LICENSE-2.0
package com.github.quantrresearch.sharepoint.online.panel.list;

import com.github.quantrresearch.sharepoint.online.Helper;
import com.github.quantrresearch.sharepoint.online.ModuleLib;
import com.github.quantrresearch.sharepoint.online.datastructure.Field;
import com.github.quantrresearch.sharepoint.online.datastructure.ListInfo;
import com.github.quantrresearch.sharepoint.online.datastructure.ServerInfo;
import com.peterswing.CommonLib;
import hk.quantr.sharepoint.SPOnline;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openide.util.Exceptions;

/**
 *
 * @author Peter <mcheung63@hotmail.com>
 */
public class ListPanel extends javax.swing.JPanel {

	public DataTableModel dataTableModel = new DataTableModel();
	public ColumnTableModel columnTableModel = new ColumnTableModel();
	public ViewTableModel viewTableModel = new ViewTableModel();
	public ImportColumnTableModel importColumnTableModel = new ImportColumnTableModel();
	ServerInfo serverInfo;
	ListInfo listInfo;
	HashMap<String, Field> fields = new HashMap<>();
	HashMap<String, Field> fieldsByTitle = new HashMap<>();

	public ListPanel(ServerInfo serverInfo, ListInfo listInfo) {
		super();
		this.serverInfo = serverInfo;
		this.listInfo = listInfo;
		initComponents();
		dataTable.setModel(dataTableModel);
		dataTable.setDefaultRenderer(Object.class, new DataTableCellRenderer());
		dataTable.getTableHeader().setReorderingAllowed(false);

		columnTable.setModel(columnTableModel);
		columnTable.setDefaultRenderer(Object.class, new ColumnTableCellRenderer());
		columnTable.getTableHeader().setReorderingAllowed(false);

		viewTable.setModel(viewTableModel);
		viewTable.setDefaultRenderer(Object.class, new ViewTableCellRenderer());
		viewTable.getTableHeader().setReorderingAllowed(false);

		importColumnTable.setModel(importColumnTableModel);
		importColumnTable.setDefaultRenderer(Object.class, new ImportColumnTableCellRenderer());
		importColumnTable.getTableHeader().setReorderingAllowed(false);
		initData();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listTableCellRenderer1 = new com.github.quantrresearch.sharepoint.online.panel.list.DataTableCellRenderer();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        viewDataComboBox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        columnTable = new javax.swing.JTable();
        jToolBar3 = new javax.swing.JToolBar();
        exportColumnExcelButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        viewComboBox = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        chooseImportColumnsExcelButton = new javax.swing.JButton();
        createImportColumnsButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        importColumnTable = new javax.swing.JTable();

        org.openide.awt.Mnemonics.setLocalizedText(listTableCellRenderer1, org.openide.util.NbBundle.getMessage(ListPanel.class, "ListPanel.listTableCellRenderer1.text")); // NOI18N

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dataTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        dataTable.setGridColor(new java.awt.Color(220, 220, 220));
        dataTable.setRowHeight(22);
        jScrollPane1.setViewportView(dataTable);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jToolBar2.setRollover(true);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(ListPanel.class, "ListPanel.jLabel2.text")); // NOI18N
        jToolBar2.add(jLabel2);

        viewDataComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        viewDataComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDataComboBoxActionPerformed(evt);
            }
        });
        jToolBar2.add(viewDataComboBox);

        jPanel1.add(jToolBar2, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(ListPanel.class, "ListPanel.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        jPanel3.setLayout(new java.awt.BorderLayout());

        columnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        columnTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        columnTable.setGridColor(new java.awt.Color(220, 220, 220));
        columnTable.setRowHeight(22);
        jScrollPane2.setViewportView(columnTable);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jToolBar3.setRollover(true);

        exportColumnExcelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/github/quantrresearch/sharepoint/online/fileicon/excel.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(exportColumnExcelButton, org.openide.util.NbBundle.getMessage(ListPanel.class, "ListPanel.exportColumnExcelButton.text")); // NOI18N
        exportColumnExcelButton.setFocusable(false);
        exportColumnExcelButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exportColumnExcelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportColumnExcelButtonActionPerformed(evt);
            }
        });
        jToolBar3.add(exportColumnExcelButton);

        jPanel3.add(jToolBar3, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(ListPanel.class, "ListPanel.jPanel3.TabConstraints.tabTitle"), jPanel3); // NOI18N

        jPanel4.setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(ListPanel.class, "ListPanel.jLabel1.text")); // NOI18N
        jToolBar1.add(jLabel1);

        viewComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        viewComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewComboBoxActionPerformed(evt);
            }
        });
        jToolBar1.add(viewComboBox);

        jPanel4.add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        viewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        viewTable.setRowHeight(22);
        jScrollPane3.setViewportView(viewTable);

        jPanel4.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(ListPanel.class, "ListPanel.jPanel4.TabConstraints.tabTitle"), jPanel4); // NOI18N

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        org.openide.awt.Mnemonics.setLocalizedText(chooseImportColumnsExcelButton, org.openide.util.NbBundle.getMessage(ListPanel.class, "ListPanel.chooseImportColumnsExcelButton.text")); // NOI18N
        chooseImportColumnsExcelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImportColumnsExcelButtonActionPerformed(evt);
            }
        });
        jPanel6.add(chooseImportColumnsExcelButton);

        org.openide.awt.Mnemonics.setLocalizedText(createImportColumnsButton, org.openide.util.NbBundle.getMessage(ListPanel.class, "ListPanel.createImportColumnsButton.text")); // NOI18N
        createImportColumnsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createImportColumnsButtonActionPerformed(evt);
            }
        });
        jPanel6.add(createImportColumnsButton);

        jPanel5.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        importColumnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        importColumnTable.setRowHeight(22);
        jScrollPane4.setViewportView(importColumnTable);

        jPanel5.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jTabbedPane2.addTab(org.openide.util.NbBundle.getMessage(ListPanel.class, "ListPanel.jPanel5.TabConstraints.tabTitle"), new javax.swing.ImageIcon(getClass().getResource("/com/github/quantrresearch/sharepoint/online/fileicon/excel.png")), jPanel5); // NOI18N

        jPanel2.add(jTabbedPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(ListPanel.class, "ListPanel.jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void viewComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewComboBoxActionPerformed
		initViewTable();
    }//GEN-LAST:event_viewComboBoxActionPerformed

    private void viewDataComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDataComboBoxActionPerformed
		initDataTable();
    }//GEN-LAST:event_viewDataComboBoxActionPerformed

    private void exportColumnExcelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportColumnExcelButtonActionPerformed
		JFileChooser fc = new JFileChooser();
		fc.setSelectedFile(new File("columns.xlsx"));
		int returnVal = fc.showSaveDialog(null);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("Columns");

			int rowNum = 0;

			Row row;
			Cell cell;
			row = sheet.createRow(rowNum++);
			row.createCell(0).setCellValue("Title");
			row.createCell(1).setCellValue("Type");
			row.createCell(2).setCellValue("Field Type Kind");
			row.createCell(3).setCellValue("Required");
			row.createCell(4).setCellValue("Default value");

			int nameIndex = columnTableModel.getColumnIndex("Name");
			int typeIndex = columnTableModel.getColumnIndex("Type");
			int fieldTypeKindIndex = columnTableModel.getColumnIndex("FieldTypeKind");
			int requiredIndex = columnTableModel.getColumnIndex("Required");
			int defaultValueIndex = columnTableModel.getColumnIndex("Default value");

			for (int x = 0; x < columnTableModel.getRowCount(); x++) {
				row = sheet.createRow(rowNum++);
				cell = row.createCell(0);
				cell.setCellValue(Objects.toString(columnTableModel.getValueAt(x, nameIndex)));
				cell = row.createCell(1);
				cell.setCellValue(Objects.toString(columnTableModel.getValueAt(x, typeIndex)));
				cell = row.createCell(2);
				cell.setCellValue(Objects.toString(columnTableModel.getValueAt(x, fieldTypeKindIndex)));
				cell = row.createCell(3);
				cell.setCellValue(Objects.toString(columnTableModel.getValueAt(x, requiredIndex)));
				cell = row.createCell(4);
				cell.setCellValue(Objects.toString(columnTableModel.getValueAt(x, defaultValueIndex)));
			}

			try {
				File file = fc.getSelectedFile();
				if (!file.getName().endsWith(".xlsx")) {
					file = new File(file.getAbsolutePath() + ".xlsx");
				}
				FileOutputStream outputStream = new FileOutputStream(file);
				workbook.write(outputStream);
				workbook.close();
			} catch (FileNotFoundException e) {
				Exceptions.printStackTrace(e);
			} catch (IOException e) {
				Exceptions.printStackTrace(e);
			}
		}
    }//GEN-LAST:event_exportColumnExcelButtonActionPerformed

    private void chooseImportColumnsExcelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseImportColumnsExcelButtonActionPerformed
		JFileChooser fc = new JFileChooser();
		FileNameExtensionFilter ff = new FileNameExtensionFilter("Excel", "xlsx");
		fc.addChoosableFileFilter(ff);
		fc.setFileFilter(ff);

		fc.setSelectedFile(new File("columns.xlsx"));
		int returnVal = fc.showOpenDialog(null);

		if (returnVal == JFileChooser.APPROVE_OPTION) {
			try {
				File file = fc.getSelectedFile();
				importColumnTableModel.data.clear();
				FileInputStream excelFile = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(excelFile);
				Sheet datatypeSheet = workbook.getSheetAt(0);
				Iterator<Row> iterator = datatypeSheet.iterator();
				iterator.next(); //skip first row
				while (iterator.hasNext()) {
					Row currentRow = iterator.next();
					String title = currentRow.getCell(0) != null ? currentRow.getCell(0).getStringCellValue() : null;
					String type = currentRow.getCell(1) != null ? currentRow.getCell(1).getStringCellValue() : null;
					String fieldTypeKind = currentRow.getCell(3) != null ? currentRow.getCell(1).getStringCellValue() : null;
					String required = currentRow.getCell(4) != null ? currentRow.getCell(2).getStringCellValue() : null;
					String defaultValue = currentRow.getCell(4) != null ? currentRow.getCell(3).getStringCellValue() : null;

					ArrayList<Object> a = new ArrayList<>();
					if (fieldsByTitle.get(title) == null) {
						a.addAll(Arrays.asList(new String[]{title, type, fieldTypeKind, required, defaultValue, "Create"}));
					} else {
						a.addAll(Arrays.asList(new String[]{title, type, fieldTypeKind, required, defaultValue, "-"}));
					}
					importColumnTableModel.data.add(a);
				}
				importColumnTableModel.fireTableDataChanged();
			} catch (FileNotFoundException e) {
				Exceptions.printStackTrace(e);
			} catch (IOException e) {
				Exceptions.printStackTrace(e);
			}
		}
    }//GEN-LAST:event_chooseImportColumnsExcelButtonActionPerformed

    private void createImportColumnsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createImportColumnsButtonActionPerformed
		Pair<String, String> token = SPOnline.login(serverInfo.username, serverInfo.password, serverInfo.domain);
		if (token != null) {
			String jsonString = SPOnline.post(token, serverInfo.domain, "/_api/contextinfo", null, null);
			JSONObject json = new JSONObject(jsonString);
			String formDigestValue = json.getJSONObject("d").getJSONObject("GetContextWebInformation").getString("FormDigestValue");
			for (int x = 0; x < importColumnTableModel.getRowCount(); x++) {
				if (importColumnTableModel.getValueAt(x, 4).equals("Create")) {
					String title = Objects.toString(importColumnTableModel.getValueAt(x, importColumnTableModel.getColumnIndex("Name")));
					String type = Objects.toString(importColumnTableModel.getValueAt(x, importColumnTableModel.getColumnIndex("Type")));
					int fieldTypeKind = 0;
					switch (type) {
						case "Integer":
							fieldTypeKind = 1;
							break;
						case "Single line of text":
							fieldTypeKind = 2;
							break;
						case "Note":
							fieldTypeKind = 3;
							break;
						case "Date and Time":
							fieldTypeKind = 4;
							break;
						case "Counter":
							fieldTypeKind = 5;
							break;
						case "Choice":
							fieldTypeKind = 6;
							break;
						case "Lookup":
							fieldTypeKind = 7;
							break;
						case "Boolean":
							fieldTypeKind = 8;
							break;
						case "Number":
							fieldTypeKind = 9;
							break;
						case "Currency":
							fieldTypeKind = 10;
							break;
						case "URL":
							fieldTypeKind = 11;
							break;
						case "Computed":
							fieldTypeKind = 12;
							break;
						case "Threading":
							fieldTypeKind = 13;
							break;
						case "Guid":
							fieldTypeKind = 14;
							break;
						case "MultiChoice":
							fieldTypeKind = 15;
							break;
						case "GridChoice":
							fieldTypeKind = 16;
							break;
						case "Calculated":
							fieldTypeKind = 17;
							break;
						case "File":
							fieldTypeKind = 18;
							break;
						case "Attachments":
							fieldTypeKind = 19;
							break;
						case "Person or Group":
							fieldTypeKind = 20;
							break;
						case "Recurrence":
							fieldTypeKind = 21;
							break;
						case "CrossProjectLink":
							fieldTypeKind = 22;
							break;
						case "ModStat":
							fieldTypeKind = 23;
							break;
						case "Error":
							fieldTypeKind = 24;
							break;
						case "Content Type Id":
							fieldTypeKind = 25;
							break;
						case "PageSeparator":
							fieldTypeKind = 26;
							break;
						case "ThreadIndex":
							fieldTypeKind = 27;
							break;
						case "WorkflowStatus":
							fieldTypeKind = 28;
							break;
						case "AllDayEvent":
							fieldTypeKind = 29;
							break;
						case "WorkflowEventType":
							fieldTypeKind = 30;
							break;
						case "MaxItems":
							fieldTypeKind = 31;
							break;
						default:
							System.err.println("Unsupported fieldTypeKind " + fieldTypeKind);
					}
					System.out.println(String.format("{'Title': '%s', 'FieldTypeKind': %d, '__metadata': { 'type': 'SP.Field' }}", title, fieldTypeKind));
					jsonString = SPOnline.post(token, serverInfo.domain, "/_api/web/lists(guid'" + listInfo.id + "')/Fields", String.format("{'Title': '%s', 'FieldTypeKind': %d, '__metadata': { 'type': 'SP.Field' }}", title, fieldTypeKind), formDigestValue);
					if (jsonString != null) {
						System.out.println(CommonLib.prettyFormatJson(jsonString));
					}
				}
			}
		}
    }//GEN-LAST:event_createImportColumnsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseImportColumnsExcelButton;
    private javax.swing.JTable columnTable;
    private javax.swing.JButton createImportColumnsButton;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton exportColumnExcelButton;
    private javax.swing.JTable importColumnTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private com.github.quantrresearch.sharepoint.online.panel.list.DataTableCellRenderer listTableCellRenderer1;
    private javax.swing.JComboBox<String> viewComboBox;
    private javax.swing.JComboBox<String> viewDataComboBox;
    private javax.swing.JTable viewTable;
    // End of variables declaration//GEN-END:variables

	private void initData() {
		initFields();
		initViewCombo();
		initColumnTable();
		initDataTable();
		initViewTable();
	}

	private void initColumnTable() {
		Pair<String, String> token = SPOnline.login(serverInfo.username, serverInfo.password, serverInfo.domain);
		if (token != null) {
			String jsonString = SPOnline.post(token, serverInfo.domain, serverInfo.path + "/_api/contextinfo", null, null);
			jsonString = SPOnline.get(token, serverInfo.domain, serverInfo.path + "/_api/web/lists(guid'" + listInfo.id + "')/Fields");
			if (jsonString != null) {
				System.out.println(CommonLib.formatJson(jsonString));
				JSONObject json = new JSONObject(jsonString);
				JSONArray array = json.getJSONObject("d").getJSONArray("results");
				for (int x = 0; x < array.length(); x++) {
					JSONObject j = array.getJSONObject(x);
					ArrayList<Object> row = new ArrayList();
					for (int z = 0; z < columnTableModel.columnFieldNames.length; z++) {
						String columnName = columnTableModel.columnFieldNames[z];
						Class columnType = columnTableModel.columnFieldtypes[z];
						try {
							if (columnType == String.class) {
								row.add(j.getString(columnName));
							} else if (columnType == Boolean.class) {
								row.add(j.getBoolean(columnName));
							} else if (columnType == Integer.class) {
								row.add(j.getInt(columnName));
							} else {
								row.add(null);
							}
						} catch (Exception ex) {
							row.add(null);
						}
					}
					columnTableModel.data.add(row);
				}
				columnTableModel.fireTableDataChanged();
			}
			CommonLib.autoResizeColumn(columnTable);
		}
	}

	private void initDataTable() {
		Pair<String, String> token = SPOnline.login(serverInfo.username, serverInfo.password, serverInfo.domain);
		if (token != null) {
			String viewTitle = (String) viewDataComboBox.getSelectedItem();
			if (viewTitle == null) {
				return;
			}
			dataTableModel.columns.clear();
			dataTableModel.data.clear();
			String jsonString = SPOnline.post(token, serverInfo.domain, "/_api/contextinfo", null, null);
			jsonString = SPOnline.get(token, serverInfo.domain, serverInfo.path + "/_api/web/lists(guid'" + listInfo.id + "')/Views/GetByTitle('" + Helper.escapeSharePointUrl(viewTitle) + "')/ViewFields");
			if (jsonString != null) {
				JSONObject json = new JSONObject(jsonString);
				JSONArray array = json.getJSONObject("d").getJSONObject("Items").getJSONArray("results");
				for (int x = 0; x < array.length(); x++) {
					dataTableModel.columns.add(fields.get(array.getString(x)));
				}
			}
			jsonString = SPOnline.get(token, serverInfo.domain, serverInfo.path + "/_api/web/lists(guid'" + listInfo.id + "')/items");
			if (jsonString != null) {
//				System.out.println(CommonLib.formatJson(jsonString));
				JSONObject json = new JSONObject(jsonString);
				JSONArray array = json.getJSONObject("d").getJSONArray("results");
				for (int x = 0; x < array.length(); x++) {
					ArrayList<Object> row = new ArrayList<>();
					JSONObject j = array.getJSONObject(x);
					for (Field field : dataTableModel.columns) {
						try {
							if (field.type.equals("Computed")) {
								row.add(j.getString(field.title));
							} else if (field.type.equals("Number")) {
								row.add(j.getInt(field.internalName));
							} else {
								row.add(j.getString(field.internalName));
							}
						} catch (Exception ex) {
							ex.printStackTrace();
							row.add("ERROR " + field.internalName);
						}
					}
					//System.out.println("r=" + row.size());
					dataTableModel.data.add(row);
				}
				dataTableModel.fireTableStructureChanged();
			}
			CommonLib.autoResizeColumn(dataTable);
		}
	}

	void initViewCombo() {
		Pair<String, String> token = SPOnline.login(serverInfo.username, serverInfo.password, serverInfo.domain);
		if (token != null) {
			ArrayList<String> columnNames = new ArrayList<>();
			String jsonString = SPOnline.post(token, serverInfo.domain, "/_api/contextinfo", null, null);
			jsonString = SPOnline.get(token, serverInfo.domain, serverInfo.path + "/_api/web/lists(guid'" + listInfo.id + "')/Views?$select=ID,Title");
			if (jsonString != null) {
				JSONObject json = new JSONObject(jsonString);
				JSONArray array = json.getJSONObject("d").getJSONArray("results");
				viewComboBox.removeAllItems();
				viewDataComboBox.removeAllItems();
				for (int x = 0; x < array.length(); x++) {
					JSONObject j = array.getJSONObject(x);
					viewComboBox.addItem(j.getString("Title"));
					viewDataComboBox.addItem(j.getString("Title"));
				}
			}
		}
	}

	void initViewTable() {
		String viewTitle = (String) viewComboBox.getSelectedItem();
		if (viewTitle == null) {
			return;
		}
		Pair< String, String> token = SPOnline.login(serverInfo.username, serverInfo.password, serverInfo.domain);
		if (token != null) {
			ArrayList<String> columnNames = new ArrayList<>();
			String jsonString = SPOnline.post(token, serverInfo.domain, "/_api/contextinfo", null, null);
			jsonString = SPOnline.get(token, serverInfo.domain, serverInfo.path + "/_api/web/lists(guid'" + listInfo.id + "')/Views/GetByTitle('" + Helper.escapeSharePointUrl(viewTitle) + "')/ViewFields");
			if (jsonString != null) {
				JSONObject json = new JSONObject(jsonString);
				JSONArray array = json.getJSONObject("d").getJSONObject("Items").getJSONArray("results");
				viewTableModel.data.clear();
				for (int x = 0; x < array.length(); x++) {
					viewTableModel.data.add(array.getString(x));
				}
				viewTableModel.fireTableDataChanged();
			}
		}
	}

	private void initFields() {
		Pair<String, String> token = SPOnline.login(serverInfo.username, serverInfo.password, serverInfo.domain);
		if (token != null) {
			String jsonString = SPOnline.post(token, serverInfo.domain, serverInfo.path + "/_api/contextinfo", null, null);
			jsonString = SPOnline.get(token, serverInfo.domain, serverInfo.path + "/_api/web/lists(guid'" + listInfo.id + "')/Fields");
			if (jsonString != null) {
				fields.clear();
				fieldsByTitle.clear();
				JSONObject json = new JSONObject(jsonString);
				JSONArray array = json.getJSONObject("d").getJSONArray("results");
				for (int x = 0; x < array.length(); x++) {
					JSONObject j = array.getJSONObject(x);
					fields.put(j.getString("EntityPropertyName"), new Field(j.getString("Title"), j.getString("TypeDisplayName"), j.getString("InternalName"), j.getString("StaticName")));
					fieldsByTitle.put(j.getString("Title"), new Field(j.getString("Title"), j.getString("TypeDisplayName"), j.getString("InternalName"), j.getString("StaticName")));
				}
			}
		}
	}

}
