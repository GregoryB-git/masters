.class public final synthetic LP5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LE5/j;

.field public final synthetic p:LV2/k;


# direct methods
.method public synthetic constructor <init>(LE5/j;LV2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP5/f;->o:LE5/j;

    .line 5
    .line 6
    iput-object p2, p0, LP5/f;->p:LV2/k;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LP5/f;->o:LE5/j;

    .line 2
    .line 3
    iget-object v1, p0, LP5/f;->p:LV2/k;

    .line 4
    .line 5
    invoke-static {v0, v1}, LP5/j;->i(LE5/j;LV2/k;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
