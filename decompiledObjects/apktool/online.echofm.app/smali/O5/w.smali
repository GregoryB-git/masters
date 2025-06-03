.class public final synthetic LO5/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LO5/x;

.field public final synthetic p:LV2/k;


# direct methods
.method public synthetic constructor <init>(LO5/x;LV2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO5/w;->o:LO5/x;

    .line 5
    .line 6
    iput-object p2, p0, LO5/w;->p:LV2/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LO5/w;->o:LO5/x;

    .line 2
    .line 3
    iget-object v1, p0, LO5/w;->p:LV2/k;

    .line 4
    .line 5
    invoke-static {v0, v1}, LO5/x;->p(LO5/x;LV2/k;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
