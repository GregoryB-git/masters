.class public final synthetic LG4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lcom/google/firebase/perf/metrics/AppStartTrace;

.field public final synthetic p:LN4/m$b;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/perf/metrics/AppStartTrace;LN4/m$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG4/f;->o:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 5
    .line 6
    iput-object p2, p0, LG4/f;->p:LN4/m$b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LG4/f;->o:Lcom/google/firebase/perf/metrics/AppStartTrace;

    .line 2
    .line 3
    iget-object v1, p0, LG4/f;->p:LN4/m$b;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/google/firebase/perf/metrics/AppStartTrace;->b(Lcom/google/firebase/perf/metrics/AppStartTrace;LN4/m$b;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
