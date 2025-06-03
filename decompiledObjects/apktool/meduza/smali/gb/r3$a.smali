.class public final Lgb/r3$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/r3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lgb/o3;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lgb/o3;->a:Lgb/o3$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lgb/r3$a;->a:Lgb/o3;

    return-void
.end method
