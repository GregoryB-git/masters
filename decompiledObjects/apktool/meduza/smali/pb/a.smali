.class public final Lpb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lpb/c;

.field public static final b:Lg9/a0;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpb/c;

    invoke-direct {v0}, Lpb/c;-><init>()V

    sput-object v0, Lpb/a;->a:Lpb/c;

    new-instance v0, Lg9/a0;

    const-wide/high16 v1, -0x8000000000000000L

    invoke-direct {v0, v1, v2}, Lg9/a0;-><init>(J)V

    sput-object v0, Lpb/a;->b:Lg9/a0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
