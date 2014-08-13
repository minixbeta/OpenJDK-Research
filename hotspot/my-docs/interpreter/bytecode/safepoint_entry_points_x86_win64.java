safepoint entry points  [0x0259aaf0, 0x0259b0f0]  1536 bytes // generate by -XX:+PrintInterpreter

// The following codes are generated when running the JVM
// With agent of JVMTI

0259AAF0  call        0259AAFA  // goto 0259AB1C
0259AAF5  jmp         0259AB8D  
0259AAFA  lea         eax,[esp+4]  
0259AAFE  cmp         dword ptr [ebp-8],0  
0259AB05  je          0259AB1C  
0259AB0B  push        7592340h  
0259AB10  call        0259AB15  
0259AB15  pushad  
0259AB16  call        MacroAssembler::debug32 (706A680h)  
0259AB1B  hlt  

// come from 0259AAF0
0259AB1C  mov         dword ptr [ebp-1Ch],esi  
0259AB1F  mov         edi,dword ptr fs:[0]  
0259AB27  mov         edi,dword ptr [edi-0Ch]  
0259AB2A  push        edi  
0259AB2B  mov         dword ptr [edi+144h],ebp  
0259AB31  mov         dword ptr [edi+13Ch],eax  



0259AB37  call        InterpreterRuntime::at_safepoint (72DF320h)  
/*
// hotspot\src\share\vm\interpreter\interpreterRuntime.cpp
IRT_ENTRY(void, InterpreterRuntime::at_safepoint(JavaThread* thread))
  // We used to need an explict preserve_arguments here for invoke bytecodes. However,
  // stack traversal automatically takes care of preserving arguments for invoke, so
  // this is no longer needed.

  // IRT_END does an implicit safepoint check, hence we are guaranteed to block
  // if this is called during a safepoint

  if (JvmtiExport::should_post_single_step()) {
    // We are called during regular safepoints and when the VM is
    // single stepping. If any thread is marked for single stepping,
    // then we may have JVMTI work to do.
    JvmtiExport::at_single_stepping_point(thread, method(thread), bcp(thread));
  }
IRT_END
*/


0259AB3C  add         esp,4  
0259AB3F  push        eax  
0259AB40  mov         eax,dword ptr fs:[0]  
0259AB48  mov         eax,dword ptr [eax-0Ch]  
0259AB4B  cmp         edi,eax  
0259AB4D  je          0259AB64  
0259AB53  push        759415Ch  
0259AB58  call        0259AB5D  
0259AB5D  pushad  
0259AB5E  call        MacroAssembler::debug32 (706A680h)  
0259AB63  hlt  
0259AB64  pop         eax  
0259AB65  mov         dword ptr [edi+13Ch],0  
0259AB6F  mov         dword ptr [edi+144h],0  
0259AB79  cmp         dword ptr [edi+4],0  
0259AB80  jne         02590340  
0259AB86  mov         esi,dword ptr [ebp-1Ch]  
0259AB89  mov         edi,dword ptr [ebp-18h]  
0259AB8C  ret  
0259AB8D  movzx       ebx,byte ptr [esi]  
0259AB90  jmp         dword ptr [ebx*4+78B6030h]  
0259AB97  sub         esp,8  
0259AB9A  fstp        qword ptr [esp]  
0259AB9D  call        0259ABA7  
0259ABA2  jmp         0259AC3A  
0259ABA7  lea         eax,[esp+4]  
0259ABAB  cmp         dword ptr [ebp-8],0  
0259ABB2  je          0259ABC9  
0259ABB8  push        7592340h  
0259ABBD  call        0259ABC2  
0259ABC2  pushad  
0259ABC3  call        MacroAssembler::debug32 (706A680h)  
0259ABC8  hlt  
0259ABC9  mov         dword ptr [ebp-1Ch],esi  
0259ABCC  mov         edi,dword ptr fs:[0]  
0259ABD4  mov         edi,dword ptr [edi-0Ch]  
0259ABD7  push        edi  
0259ABD8  mov         dword ptr [edi+144h],ebp  
0259ABDE  mov         dword ptr [edi+13Ch],eax  
0259ABE4  call        InterpreterRuntime::at_safepoint (72DF320h)  
0259ABE9  add         esp,4  
0259ABEC  push        eax  
0259ABED  mov         eax,dword ptr fs:[0]  
0259ABF5  mov         eax,dword ptr [eax-0Ch]  
0259ABF8  cmp         edi,eax  
0259ABFA  je          0259AC11  
0259AC00  push        759415Ch  
0259AC05  call        0259AC0A  
0259AC0A  pushad  
0259AC0B  call        MacroAssembler::debug32 (706A680h)  
0259AC10  hlt  
0259AC11  pop         eax  
0259AC12  mov         dword ptr [edi+13Ch],0  
0259AC1C  mov         dword ptr [edi+144h],0  
0259AC26  cmp         dword ptr [edi+4],0  
0259AC2D  jne         02590340  
0259AC33  mov         esi,dword ptr [ebp-1Ch]  
0259AC36  mov         edi,dword ptr [ebp-18h]  
0259AC39  ret  
0259AC3A  movzx       ebx,byte ptr [esi]  
0259AC3D  jmp         dword ptr [ebx*4+78B6030h]  
0259AC44  sub         esp,4  
0259AC47  fstp        dword ptr [esp]  
0259AC4A  call        0259AC54  
0259AC4F  jmp         0259ACE7  
0259AC54  lea         eax,[esp+4]  
0259AC58  cmp         dword ptr [ebp-8],0  
0259AC5F  je          0259AC76  
0259AC65  push        7592340h  
0259AC6A  call        0259AC6F  
0259AC6F  pushad  
0259AC70  call        MacroAssembler::debug32 (706A680h)  
0259AC75  hlt  
0259AC76  mov         dword ptr [ebp-1Ch],esi  
0259AC79  mov         edi,dword ptr fs:[0]  
0259AC81  mov         edi,dword ptr [edi-0Ch]  
0259AC84  push        edi  
0259AC85  mov         dword ptr [edi+144h],ebp  
0259AC8B  mov         dword ptr [edi+13Ch],eax  
0259AC91  call        InterpreterRuntime::at_safepoint (72DF320h)  
0259AC96  add         esp,4  
0259AC99  push        eax  
0259AC9A  mov         eax,dword ptr fs:[0]  
0259ACA2  mov         eax,dword ptr [eax-0Ch]  
0259ACA5  cmp         edi,eax  
0259ACA7  je          0259ACBE  
0259ACAD  push        759415Ch  
0259ACB2  call        0259ACB7  
0259ACB7  pushad  
0259ACB8  call        MacroAssembler::debug32 (706A680h)  
0259ACBD  hlt  
0259ACBE  pop         eax  
0259ACBF  mov         dword ptr [edi+13Ch],0  
0259ACC9  mov         dword ptr [edi+144h],0  
0259ACD3  cmp         dword ptr [edi+4],0  
0259ACDA  jne         02590340  
0259ACE0  mov         esi,dword ptr [ebp-1Ch]  
0259ACE3  mov         edi,dword ptr [ebp-18h]  
0259ACE6  ret  
0259ACE7  movzx       ebx,byte ptr [esi]  
0259ACEA  jmp         dword ptr [ebx*4+78B6030h]  
0259ACF1  push        edx  
0259ACF2  push        eax  
0259ACF3  call        0259ACFD  
0259ACF8  jmp         0259AD90  
0259ACFD  lea         eax,[esp+4]  
0259AD01  cmp         dword ptr [ebp-8],0  
0259AD08  je          0259AD1F  
0259AD0E  push        7592340h  
0259AD13  call        0259AD18  
0259AD18  pushad  
0259AD19  call        MacroAssembler::debug32 (706A680h)  
0259AD1E  hlt  
0259AD1F  mov         dword ptr [ebp-1Ch],esi  
0259AD22  mov         edi,dword ptr fs:[0]  
0259AD2A  mov         edi,dword ptr [edi-0Ch]  
0259AD2D  push        edi  
0259AD2E  mov         dword ptr [edi+144h],ebp  
0259AD34  mov         dword ptr [edi+13Ch],eax  
0259AD3A  call        InterpreterRuntime::at_safepoint (72DF320h)  
0259AD3F  add         esp,4  
0259AD42  push        eax  
0259AD43  mov         eax,dword ptr fs:[0]  
0259AD4B  mov         eax,dword ptr [eax-0Ch]  
0259AD4E  cmp         edi,eax  
0259AD50  je          0259AD67  
0259AD56  push        759415Ch  
0259AD5B  call        0259AD60  
0259AD60  pushad  
0259AD61  call        MacroAssembler::debug32 (706A680h)  
0259AD66  hlt  
0259AD67  pop         eax  
0259AD68  mov         dword ptr [edi+13Ch],0  
0259AD72  mov         dword ptr [edi+144h],0  
0259AD7C  cmp         dword ptr [edi+4],0  
0259AD83  jne         02590340  
0259AD89  mov         esi,dword ptr [ebp-1Ch]  
0259AD8C  mov         edi,dword ptr [ebp-18h]  
0259AD8F  ret  
0259AD90  movzx       ebx,byte ptr [esi]  
0259AD93  jmp         dword ptr [ebx*4+78B6030h]  
0259AD9A  push        eax  
0259AD9B  call        0259ADA5  
0259ADA0  jmp         0259AE38  
0259ADA5  lea         eax,[esp+4]  
0259ADA9  cmp         dword ptr [ebp-8],0  
0259ADB0  je          0259ADC7  
0259ADB6  push        7592340h  
0259ADBB  call        0259ADC0  
0259ADC0  pushad  
0259ADC1  call        MacroAssembler::debug32 (706A680h)  
0259ADC6  hlt  
0259ADC7  mov         dword ptr [ebp-1Ch],esi  
0259ADCA  mov         edi,dword ptr fs:[0]  
0259ADD2  mov         edi,dword ptr [edi-0Ch]  
0259ADD5  push        edi  
0259ADD6  mov         dword ptr [edi+144h],ebp  
0259ADDC  mov         dword ptr [edi+13Ch],eax  
0259ADE2  call        InterpreterRuntime::at_safepoint (72DF320h)  
0259ADE7  add         esp,4  
0259ADEA  push        eax  
0259ADEB  mov         eax,dword ptr fs:[0]  
0259ADF3  mov         eax,dword ptr [eax-0Ch]  
0259ADF6  cmp         edi,eax  
0259ADF8  je          0259AE0F  
0259ADFE  push        759415Ch  
0259AE03  call        0259AE08  
0259AE08  pushad  
0259AE09  call        MacroAssembler::debug32 (706A680h)  
0259AE0E  hlt  
0259AE0F  pop         eax  
0259AE10  mov         dword ptr [edi+13Ch],0  
0259AE1A  mov         dword ptr [edi+144h],0  
0259AE24  cmp         dword ptr [edi+4],0  
0259AE2B  jne         02590340  
0259AE31  mov         esi,dword ptr [ebp-1Ch]  
0259AE34  mov         edi,dword ptr [ebp-18h]  
0259AE37  ret  
0259AE38  movzx       ebx,byte ptr [esi]  
0259AE3B  jmp         dword ptr [ebx*4+78B6030h]  
0259AE42  push        eax  
0259AE43  call        0259AE4D  
0259AE48  jmp         0259AEE0  
0259AE4D  lea         eax,[esp+4]  
0259AE51  cmp         dword ptr [ebp-8],0  
0259AE58  je          0259AE6F  
0259AE5E  push        7592340h  
0259AE63  call        0259AE68  
0259AE68  pushad  
0259AE69  call        MacroAssembler::debug32 (706A680h)  
0259AE6E  hlt  
0259AE6F  mov         dword ptr [ebp-1Ch],esi  
0259AE72  mov         edi,dword ptr fs:[0]  
0259AE7A  mov         edi,dword ptr [edi-0Ch]  
0259AE7D  push        edi  
0259AE7E  mov         dword ptr [edi+144h],ebp  
0259AE84  mov         dword ptr [edi+13Ch],eax  
0259AE8A  call        InterpreterRuntime::at_safepoint (72DF320h)  
0259AE8F  add         esp,4  
0259AE92  push        eax  
0259AE93  mov         eax,dword ptr fs:[0]  
0259AE9B  mov         eax,dword ptr [eax-0Ch]  
0259AE9E  cmp         edi,eax  
0259AEA0  je          0259AEB7  
0259AEA6  push        759415Ch  
0259AEAB  call        0259AEB0  
0259AEB0  pushad  
0259AEB1  call        MacroAssembler::debug32 (706A680h)  
0259AEB6  hlt  
0259AEB7  pop         eax  
0259AEB8  mov         dword ptr [edi+13Ch],0  
0259AEC2  mov         dword ptr [edi+144h],0  
0259AECC  cmp         dword ptr [edi+4],0  
0259AED3  jne         02590340  
0259AED9  mov         esi,dword ptr [ebp-1Ch]  
0259AEDC  mov         edi,dword ptr [ebp-18h]  
0259AEDF  ret  
0259AEE0  movzx       ebx,byte ptr [esi]  
0259AEE3  jmp         dword ptr [ebx*4+78B6030h]  
0259AEEA  push        eax  
0259AEEB  call        0259AEF5  
0259AEF0  jmp         0259AF88  
0259AEF5  lea         eax,[esp+4]  
0259AEF9  cmp         dword ptr [ebp-8],0  
0259AF00  je          0259AF17  
0259AF06  push        7592340h  
0259AF0B  call        0259AF10  
0259AF10  pushad  
0259AF11  call        MacroAssembler::debug32 (706A680h)  
0259AF16  hlt  
0259AF17  mov         dword ptr [ebp-1Ch],esi  
0259AF1A  mov         edi,dword ptr fs:[0]  
0259AF22  mov         edi,dword ptr [edi-0Ch]  
0259AF25  push        edi  
0259AF26  mov         dword ptr [edi+144h],ebp  
0259AF2C  mov         dword ptr [edi+13Ch],eax  
0259AF32  call        InterpreterRuntime::at_safepoint (72DF320h)  
0259AF37  add         esp,4  
0259AF3A  push        eax  
0259AF3B  mov         eax,dword ptr fs:[0]  
0259AF43  mov         eax,dword ptr [eax-0Ch]  
0259AF46  cmp         edi,eax  
0259AF48  je          0259AF5F  
0259AF4E  push        759415Ch  
0259AF53  call        0259AF58  
0259AF58  pushad  
0259AF59  call        MacroAssembler::debug32 (706A680h)  
0259AF5E  hlt  
0259AF5F  pop         eax  
0259AF60  mov         dword ptr [edi+13Ch],0  
0259AF6A  mov         dword ptr [edi+144h],0  
0259AF74  cmp         dword ptr [edi+4],0  
0259AF7B  jne         02590340  
0259AF81  mov         esi,dword ptr [ebp-1Ch]  
0259AF84  mov         edi,dword ptr [ebp-18h]  
0259AF87  ret  
0259AF88  movzx       ebx,byte ptr [esi]  
0259AF8B  jmp         dword ptr [ebx*4+78B6030h]  
0259AF92  push        eax  
0259AF93  call        0259AF9D  
0259AF98  jmp         0259B030  
0259AF9D  lea         eax,[esp+4]  
0259AFA1  cmp         dword ptr [ebp-8],0  
0259AFA8  je          0259AFBF  
0259AFAE  push        7592340h  
0259AFB3  call        0259AFB8  
0259AFB8  pushad  
0259AFB9  call        MacroAssembler::debug32 (706A680h)  
0259AFBE  hlt  
0259AFBF  mov         dword ptr [ebp-1Ch],esi  
0259AFC2  mov         edi,dword ptr fs:[0]  
0259AFCA  mov         edi,dword ptr [edi-0Ch]  
0259AFCD  push        edi  
0259AFCE  mov         dword ptr [edi+144h],ebp  
0259AFD4  mov         dword ptr [edi+13Ch],eax  
0259AFDA  call        InterpreterRuntime::at_safepoint (72DF320h)  
0259AFDF  add         esp,4  
0259AFE2  push        eax  
0259AFE3  mov         eax,dword ptr fs:[0]  
0259AFEB  mov         eax,dword ptr [eax-0Ch]  
0259AFEE  cmp         edi,eax  
0259AFF0  je          0259B007  
0259AFF6  push        759415Ch  
0259AFFB  call        0259B000  
0259B000  pushad  
0259B001  call        MacroAssembler::debug32 (706A680h)  
0259B006  hlt  
0259B007  pop         eax  
0259B008  mov         dword ptr [edi+13Ch],0  
0259B012  mov         dword ptr [edi+144h],0  
0259B01C  cmp         dword ptr [edi+4],0  
0259B023  jne         02590340  
0259B029  mov         esi,dword ptr [ebp-1Ch]  
0259B02C  mov         edi,dword ptr [ebp-18h]  
0259B02F  ret  
0259B030  movzx       ebx,byte ptr [esi]  
0259B033  jmp         dword ptr [ebx*4+78B6030h]  
0259B03A  push        eax  
0259B03B  call        0259B045  
0259B040  jmp         0259B0D8  
0259B045  lea         eax,[esp+4]  
0259B049  cmp         dword ptr [ebp-8],0  
0259B050  je          0259B067  
0259B056  push        7592340h  
0259B05B  call        0259B060  
0259B060  pushad  
0259B061  call        MacroAssembler::debug32 (706A680h)  
0259B066  hlt  
0259B067  mov         dword ptr [ebp-1Ch],esi  
0259B06A  mov         edi,dword ptr fs:[0]  
0259B072  mov         edi,dword ptr [edi-0Ch]  
0259B075  push        edi  
0259B076  mov         dword ptr [edi+144h],ebp  
0259B07C  mov         dword ptr [edi+13Ch],eax  
0259B082  call        InterpreterRuntime::at_safepoint (72DF320h)  
0259B087  add         esp,4  
0259B08A  push        eax  
0259B08B  mov         eax,dword ptr fs:[0]  
0259B093  mov         eax,dword ptr [eax-0Ch]  
0259B096  cmp         edi,eax  
0259B098  je          0259B0AF  
0259B09E  push        759415Ch  
0259B0A3  call        0259B0A8  
0259B0A8  pushad  
0259B0A9  call        MacroAssembler::debug32 (706A680h)  
0259B0AE  hlt  
0259B0AF  pop         eax  
0259B0B0  mov         dword ptr [edi+13Ch],0  
0259B0BA  mov         dword ptr [edi+144h],0  
0259B0C4  cmp         dword ptr [edi+4],0  
0259B0CB  jne         02590340  
0259B0D1  mov         esi,dword ptr [ebp-1Ch]  
0259B0D4  mov         edi,dword ptr [ebp-18h]  
0259B0D7  ret  
0259B0D8  movzx       ebx,byte ptr [esi]  
0259B0DB  jmp         dword ptr [ebx*4+78B6030h]  
0259B0E2  nop  
0259B0E3  nop  
0259B0E4  int         3  
0259B0E5  int         3  
0259B0E6  int         3  
0259B0E7  int         3  
0259B0E8  int         3  
0259B0E9  int         3  
0259B0EA  int         3  
0259B0EB  int         3  
0259B0EC  int         3  
0259B0ED  int         3  
0259B0EE  int         3  
0259B0EF  int         3  
