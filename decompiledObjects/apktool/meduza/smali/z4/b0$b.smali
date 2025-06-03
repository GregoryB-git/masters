.class public final Lz4/b0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lv3/i0;

.field public final b:La4/h$b;


# direct methods
.method public constructor <init>(Lv3/i0;La4/h$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/b0$b;->a:Lv3/i0;

    iput-object p2, p0, Lz4/b0$b;->b:La4/h$b;

    return-void
.end method
