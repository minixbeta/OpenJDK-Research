getstatic  178 getstatic  [0x025a7d80, 0x025a7f50]  464 bytes // generate by -XX:+PrintInterpreter

// The following codes are generated when running the JVM

// Why not start at 0x025a7d80?
025A7D7F  add         al,byte ptr [ebx+1CD904ECh]  
025A7D85  and         al,0E9h  
025A7D87  sbb         dword ptr [eax],eax  
025A7D89  add         byte ptr [eax],al  


025A7D8B  sub         esp,8  
025A7D8E  fstp        qword ptr [esp]  
025A7D91  jmp         025A7DA4  
025A7D96  push        edx  
025A7D97  push        eax  
025A7D98  jmp         025A7DA4  
025A7D9D  push        eax  
025A7D9E  jmp         025A7DA4  
025A7DA3  push        eax  
025A7DA4  movzx       edx,word ptr [esi+1]  
025A7DA8  mov         ecx,dword ptr [ebp-14h]  
025A7DAB  shl         edx,2  


// Skip to here from other place
025A7DAE  mov         ebx,dword ptr [ecx+edx*4+8]  
025A7DB2  shr         ebx,10h  
025A7DB5  and         ebx,0FFh  
025A7DBB  cmp         ebx,0B2h  
025A7DC1  je          025A7E74  
025A7DC7  mov         ebx,0B2h  
025A7DCC  call        025A7DD6  
025A7DD1  jmp         025A7E6A  
025A7DD6  push        ebx  
025A7DD7  lea         eax,[esp+8]  
025A7DDB  cmp         dword ptr [ebp-8],0  
025A7DE2  je          025A7DF9  
025A7DE8  push        7592340h  
025A7DED  call        025A7DF2  
025A7DF2  pushad  
025A7DF3  call        MacroAssembler::debug32 (706A680h)  
025A7DF8  hlt  
025A7DF9  mov         dword ptr [ebp-1Ch],esi  
025A7DFC  mov         edi,dword ptr fs:[0]  
025A7E04  mov         edi,dword ptr [edi-0Ch]  
025A7E07  push        edi  
025A7E08  mov         dword ptr [edi+144h],ebp  
025A7E0E  mov         dword ptr [edi+13Ch],eax  
025A7E14  call        InterpreterRuntime::resolve_get_put (72DCAB0h)  
025A7E19  add         esp,8  
025A7E1C  push        eax  
025A7E1D  mov         eax,dword ptr fs:[0]  
025A7E25  mov         eax,dword ptr [eax-0Ch]  
025A7E28  cmp         edi,eax  
025A7E2A  je          025A7E41  
025A7E30  push        759415Ch  
025A7E35  call        025A7E3A  
025A7E3A  pushad  
025A7E3B  call        MacroAssembler::debug32 (706A680h)  
025A7E40  hlt  
025A7E41  pop         eax  
025A7E42  mov         dword ptr [edi+13Ch],0  
025A7E4C  mov         dword ptr [edi+144h],0  
025A7E56  cmp         dword ptr [edi+4],0  
025A7E5D  jne         02590340  
025A7E63  mov         esi,dword ptr [ebp-1Ch]  
025A7E66  mov         edi,dword ptr [ebp-18h]  
025A7E69  ret  
025A7E6A  movzx       edx,word ptr [esi+1]  
025A7E6E  mov         ecx,dword ptr [ebp-14h]  
025A7E71  shl         edx,2  
025A7E74  mov         ebx,dword ptr [ecx+edx*4+10h]  
025A7E78  mov         eax,dword ptr [ecx+edx*4+14h]  
025A7E7C  mov         ecx,dword ptr [ecx+edx*4+0Ch]  
025A7E80  mov         ecx,dword ptr [ecx+3Ch]  
025A7E83  shr         eax,1Ch  
025A7E86  and         eax,0Fh  
025A7E89  jne         025A7E99  
025A7E8F  movsx       eax,byte ptr [ecx+ebx]  
025A7E93  push        eax  
025A7E94  jmp         025A7F3A  
025A7E99  cmp         eax,3  
025A7E9C  jne         025A7EAB  
025A7EA2  mov         eax,dword ptr [ecx+ebx]  
025A7EA5  push        eax  
025A7EA6  jmp         025A7F3A  
025A7EAB  cmp         eax,7  
025A7EAE  jne         025A7EBD  
025A7EB4  mov         eax,dword ptr [ecx+ebx]  
025A7EB7  push        eax  
025A7EB8  jmp         025A7F3A  
025A7EBD  cmp         eax,1  
025A7EC0  jne         025A7ED0  
025A7EC6  movzx       eax,word ptr [ecx+ebx]  
025A7ECA  push        eax  
025A7ECB  jmp         025A7F3A  
025A7ED0  cmp         eax,2  
025A7ED3  jne         025A7EE3  
025A7ED9  movsx       eax,word ptr [ecx+ebx]  
025A7EDD  push        eax  
025A7EDE  jmp         025A7F3A  
025A7EE3  cmp         eax,4  
025A7EE6  jne         025A7EFE  
025A7EEC  fild        qword ptr [ecx+ebx]  
025A7EEF  sub         esp,8  
025A7EF2  fistp       qword ptr [esp]  
025A7EF5  pop         eax  
025A7EF6  pop         edx  
025A7EF7  push        edx  
025A7EF8  push        eax  
025A7EF9  jmp         025A7F3A  
025A7EFE  cmp         eax,5  
025A7F01  jne         025A7F15  
025A7F07  fld         dword ptr [ecx+ebx]  
025A7F0A  sub         esp,4  
025A7F0D  fstp        dword ptr [esp]  
025A7F10  jmp         025A7F3A  
025A7F15  cmp         eax,6  
025A7F18  jne         025A7F29  
025A7F1E  fld         qword ptr [ecx+ebx]  
025A7F21  sub         esp,8  
025A7F24  fstp        qword ptr [esp]  
025A7F27  jmp         025A7F3A  
025A7F29  push        759C7C8h  
025A7F2E  call        025A7F33  
025A7F33  pushad  
025A7F34  call        MacroAssembler::debug32 (706A680h)  
025A7F39  hlt  
025A7F3A  movzx       ebx,byte ptr [esi+3]  
025A7F3E  add         esi,3  
025A7F41  jmp         dword ptr [ebx*4+78B8430h]  
025A7F48  int         3  
025A7F49  int         3  
025A7F4A  int         3  
025A7F4B  int         3  
025A7F4C  int         3  
025A7F4D  int         3  
025A7F4E  int         3  
025A7F4F  int         3  
