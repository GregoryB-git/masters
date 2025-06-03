.class public final Lea/c0;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.SessionFirelogPublisherImpl"
    f = "SessionFirelogPublisher.kt"
    l = {
        0x5e
    }
    m = "shouldLogSession"
.end annotation


# instance fields
.field public a:Lea/b0;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lea/b0;

.field public d:I


# direct methods
.method public constructor <init>(Lea/b0;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lea/b0;",
            "Lub/e<",
            "-",
            "Lea/c0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lea/c0;->c:Lea/b0;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lea/c0;->b:Ljava/lang/Object;

    iget p1, p0, Lea/c0;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lea/c0;->d:I

    iget-object p1, p0, Lea/c0;->c:Lea/b0;

    invoke-static {p1, p0}, Lea/b0;->b(Lea/b0;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
