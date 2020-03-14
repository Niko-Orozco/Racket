; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

#define MyAppName "Guia Racket"
#define MyAppVersion "1.5"
#define MyAppPublisher "UTP"
#define MyAppURL "http://www.utp.edu.co/"
#define MyAppExeName "Guia_Racket.exe"

[Setup]
; NOTE: The value of AppId uniquely identifies this application. Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{9AC50733-0617-4816-A760-EE3347674662}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
AppPublisherURL={#MyAppURL}
AppSupportURL={#MyAppURL}
AppUpdatesURL={#MyAppURL}
DefaultDirName={autopf}\{#MyAppName}
DisableProgramGroupPage=yes
; Uncomment the following line to run in non administrative install mode (install for current user only.)
;PrivilegesRequired=lowest
OutputDir=C:\Users\xlOnly\Documents\Racket\App
OutputBaseFilename=Racket Setup
SetupIconFile=C:\Users\xlOnly\Documents\Racket\Racket Study Tool\src\Images\Icono app\racket-icon.ico
Compression=lzma
SolidCompression=yes
WizardStyle=modern

[Languages]
Name: "spanish"; MessagesFile: "compiler:Languages\Spanish.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "C:\Users\xlOnly\Documents\Racket\App\Guia_Racket.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\xlOnly\Documents\Racket\Racket Study Tool\dist\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
Source: "C:\Users\xlOnly\Documents\Racket\App\launch4j.log"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\xlOnly\Documents\Racket\App\RacketApp.xml"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\xlOnly\Documents\Racket\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{autoprograms}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{autodesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: desktopicon

[Run]
Filename: "{app}\{#MyAppExeName}"; Description: "{cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}"; Flags: nowait postinstall skipifsilent

