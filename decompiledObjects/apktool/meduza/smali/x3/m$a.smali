.class public final Lx3/m$a;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lv3/i0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lv3/i0;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lx3/m$a;->a:Lv3/i0;

    return-void
.end method

.method public constructor <init>(Lx3/f$b;Lv3/i0;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    iput-object p2, p0, Lx3/m$a;->a:Lv3/i0;

    return-void
.end method
