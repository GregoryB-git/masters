.class public final Lq5/f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq5/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final c:Lb0/d;


# instance fields
.field public final a:Lq5/f$b;

.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb0/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lb0/d;-><init>(I)V

    sput-object v0, Lq5/f$a;->c:Lb0/d;

    return-void
.end method

.method public constructor <init>(Lq5/f$b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/f$a;->a:Lq5/f$b;

    iput p2, p0, Lq5/f$a;->b:I

    return-void
.end method
