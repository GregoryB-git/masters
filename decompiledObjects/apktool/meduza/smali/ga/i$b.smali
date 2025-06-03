.class public final Lga/i$b;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lga/i;->c(Lr0/d$a;Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lwb/c;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.settings.SettingsCache"
    f = "SettingsCache.kt"
    l = {
        0x77
    }
    m = "updateConfigValue"
.end annotation


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lga/i;

.field public c:I


# direct methods
.method public constructor <init>(Lga/i;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lga/i;",
            "Lub/e<",
            "-",
            "Lga/i$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lga/i$b;->b:Lga/i;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lga/i$b;->a:Ljava/lang/Object;

    iget p1, p0, Lga/i$b;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lga/i$b;->c:I

    iget-object p1, p0, Lga/i$b;->b:Lga/i;

    sget-object v0, Lga/i;->c:Lr0/d$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lga/i;->c(Lr0/d$a;Ljava/lang/Object;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
