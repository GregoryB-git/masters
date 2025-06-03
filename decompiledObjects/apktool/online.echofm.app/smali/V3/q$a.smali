.class public LV3/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/q;->c(LV3/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/q$a;->o:LV3/m;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, LV3/q$a;->o:LV3/m;

    .line 2
    .line 3
    invoke-virtual {v0}, LV3/m;->P()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
