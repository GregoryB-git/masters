.class public final enum Lb7/c0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb7/c0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb7/c0;",
        ">;",
        "Landroid/os/Parcelable;"
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lb7/c0;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum b:Lb7/c0;

.field public static final synthetic c:[Lb7/c0;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v0, Lb7/c0;

    const-string v1, "RESIDENT_KEY_DISCOURAGED"

    const/4 v2, 0x0

    const-string v3, "discouraged"

    invoke-direct {v0, v1, v2, v3}, Lb7/c0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v1, Lb7/c0;

    const-string v3, "RESIDENT_KEY_PREFERRED"

    const/4 v4, 0x1

    const-string v5, "preferred"

    invoke-direct {v1, v3, v4, v5}, Lb7/c0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    new-instance v3, Lb7/c0;

    const-string v5, "RESIDENT_KEY_REQUIRED"

    const/4 v6, 0x2

    const-string v7, "required"

    invoke-direct {v3, v5, v6, v7}, Lb7/c0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lb7/c0;->b:Lb7/c0;

    const/4 v5, 0x3

    new-array v5, v5, [Lb7/c0;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lb7/c0;->c:[Lb7/c0;

    new-instance v0, Lb7/a1;

    invoke-direct {v0}, Lb7/a1;-><init>()V

    sput-object v0, Lb7/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lb7/c0;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb7/c0;
    .locals 1

    const-class v0, Lb7/c0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb7/c0;

    return-object p0
.end method

.method public static values()[Lb7/c0;
    .locals 1

    sget-object v0, Lb7/c0;->c:[Lb7/c0;

    invoke-virtual {v0}, [Lb7/c0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb7/c0;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb7/c0;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget-object p2, p0, Lb7/c0;->a:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
