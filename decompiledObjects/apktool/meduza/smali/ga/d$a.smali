.class public final Lga/d$a;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lga/d;->d(Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.settings.RemoteSettings"
    f = "RemoteSettings.kt"
    l = {
        0xaa,
        0x4c,
        0x5e
    }
    m = "updateSettings"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Lvc/a;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lga/d;

.field public e:I


# direct methods
.method public constructor <init>(Lga/d;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lga/d;",
            "Lub/e<",
            "-",
            "Lga/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lga/d$a;->d:Lga/d;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lga/d$a;->c:Ljava/lang/Object;

    iget p1, p0, Lga/d$a;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lga/d$a;->e:I

    iget-object p1, p0, Lga/d$a;->d:Lga/d;

    invoke-virtual {p1, p0}, Lga/d;->d(Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
