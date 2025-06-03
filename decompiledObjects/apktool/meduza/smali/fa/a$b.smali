.class public final Lfa/a$b;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfa/a;->b(Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies"
    f = "FirebaseSessionsDependencies.kt"
    l = {
        0x7c
    }
    m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions"
.end annotation


# instance fields
.field public a:Ljava/util/Map;

.field public b:Ljava/util/Iterator;

.field public c:Lfa/b$a;

.field public d:Lvc/a;

.field public e:Ljava/util/Map;

.field public f:Ljava/lang/Object;

.field public synthetic o:Ljava/lang/Object;

.field public final synthetic p:Lfa/a;

.field public q:I


# direct methods
.method public constructor <init>(Lfa/a;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfa/a;",
            "Lub/e<",
            "-",
            "Lfa/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfa/a$b;->p:Lfa/a;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfa/a$b;->o:Ljava/lang/Object;

    iget p1, p0, Lfa/a$b;->q:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfa/a$b;->q:I

    iget-object p1, p0, Lfa/a$b;->p:Lfa/a;

    invoke-virtual {p1, p0}, Lfa/a;->b(Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
