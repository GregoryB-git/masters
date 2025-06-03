.class public final Lgb/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:J

.field public final synthetic b:Lgb/h;


# direct methods
.method public constructor <init>(Lgb/h;J)V
    .locals 0

    iput-object p1, p0, Lgb/h$a;->b:Lgb/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lgb/h$a;->a:J

    return-void
.end method
