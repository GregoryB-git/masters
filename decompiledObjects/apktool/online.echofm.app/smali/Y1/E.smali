.class public final LY1/E;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LY1/E;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LY1/E;

    .line 2
    .line 3
    invoke-direct {v0}, LY1/E;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY1/E;->a:LY1/E;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lx1/F;
    .locals 2

    .line 1
    const-string v0, "authorizationCode"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "redirectUri"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "codeVerifier"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "code"

    .line 22
    .line 23
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p0, "client_id"

    .line 27
    .line 28
    invoke-static {}, Lx1/B;->m()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, p0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string p0, "redirect_uri"

    .line 36
    .line 37
    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string p0, "code_verifier"

    .line 41
    .line 42
    invoke-virtual {v0, p0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lx1/F;->n:Lx1/F$c;

    .line 46
    .line 47
    const/4 p1, 0x0

    .line 48
    const-string p2, "oauth/access_token"

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, p1}, Lx1/F$c;->x(Lx1/a;Ljava/lang/String;Lx1/F$b;)Lx1/F;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    sget-object p1, Lx1/L;->o:Lx1/L;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lx1/F;->F(Lx1/L;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lx1/F;->G(Landroid/os/Bundle;)V

    .line 60
    .line 61
    .line 62
    return-object p0
.end method
