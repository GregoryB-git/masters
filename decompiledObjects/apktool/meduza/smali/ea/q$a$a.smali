.class public final Lea/q$a$a;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lea/q$a;->a(Lu9/d;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.InstallationId$Companion"
    f = "InstallationId.kt"
    l = {
        0x20,
        0x28
    }
    m = "create"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lea/q$a;

.field public d:I


# direct methods
.method public constructor <init>(Lea/q$a;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lea/q$a;",
            "Lub/e<",
            "-",
            "Lea/q$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lea/q$a$a;->c:Lea/q$a;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lea/q$a$a;->b:Ljava/lang/Object;

    iget p1, p0, Lea/q$a$a;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lea/q$a$a;->d:I

    iget-object p1, p0, Lea/q$a$a;->c:Lea/q$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lea/q$a;->a(Lu9/d;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
