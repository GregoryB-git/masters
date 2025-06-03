.class public abstract Lb8/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Lp6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lp6/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "PhoneAuthProvider"

    invoke-direct {v0, v2, v1}, Lp6/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Lb8/f0;->zza:Lp6/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object p1, Lb8/f0;->zza:Lp6/a;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v1, p1, Lp6/a;->a:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "Sms auto retrieval timed-out."

    .line 9
    .line 10
    invoke-virtual {p1, v2, v0}, Lp6/a;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public onCodeSent(Ljava/lang/String;Lb8/e0;)V
    .locals 0

    return-void
.end method

.method public abstract onVerificationCompleted(Lb8/c0;)V
.end method

.method public abstract onVerificationFailed(Lu7/h;)V
.end method
