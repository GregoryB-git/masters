.class public final synthetic LA4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB3/h;


# instance fields
.field public final synthetic a:LB3/F;


# direct methods
.method public synthetic constructor <init>(LB3/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA4/d;->a:LB3/F;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(LB3/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LA4/d;->a:LB3/F;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->b(LB3/F;LB3/e;)LA4/b;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
