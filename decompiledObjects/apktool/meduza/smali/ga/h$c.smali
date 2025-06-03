.class public final Lga/h$c;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lga/h;->b(Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.settings.SessionsSettings"
    f = "SessionsSettings.kt"
    l = {
        0x8a,
        0x8b
    }
    m = "updateSettings"
.end annotation


# instance fields
.field public a:Lga/h;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lga/h;

.field public d:I


# direct methods
.method public constructor <init>(Lga/h;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lga/h;",
            "Lub/e<",
            "-",
            "Lga/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lga/h$c;->c:Lga/h;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lga/h$c;->b:Ljava/lang/Object;

    iget p1, p0, Lga/h$c;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lga/h$c;->d:I

    iget-object p1, p0, Lga/h$c;->c:Lga/h;

    invoke-virtual {p1, p0}, Lga/h;->b(Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
